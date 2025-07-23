load("@rules_java//java:defs.bzl", "java_binary", "java_test")

package(default_visibility = ["//visibility:public"])

# Define your main application binary
java_binary(
    name = "BazelProject",
    srcs = glob(["src/main/java/org/example/*.java"]),
    main_class = "org.example.Main"
)

# Define your test target
java_test(
    name = "BazelProjectTest1",
    srcs = glob(["src/test/java/test/Test1.java"]),
    deps = [
      ":BazelProject",
      "@maven//:junit_junit",
    ],
    test_class = "test.Test1"
)

java_test(
    name = "BazelProjectTest2",
    srcs = glob(["src/test/java/test/Test2.java"]),
    deps = [
      ":BazelProject",
      "@maven//:junit_junit",
    ],
    test_class = "test.Test2"
)
