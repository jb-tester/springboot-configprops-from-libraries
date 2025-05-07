### Classes from libraries using for configuration properties:

1) lib class using as configuration property type:
    the class properties are resolved, the javadoc is **not** shown
2) collection of lib classes using as configuration property type:
    the class properties are resolved, the javadoc is shown **OK**!!!
3) lib class using as configuration property class parent:
    the class properties are resolved, the javadoc is **not** shown
4) `@ConfigurationProperties`-annotated `@Bean` method of library class type:
    the class properties are resolved, the javadoc is **not** shown


https://youtrack.jetbrains.com/issue/IDEA-352611  - fixed
https://youtrack.jetbrains.com/issue/IDEA-370786 - for javadocs

#### to recreate:
1) open the `pojo-library` and `springboot-module` projects as separate IDEA projects
   (not as a single IDEA project with 2 modules!)
2) install the `pojo-library` module into the local maven repository with javadocs
   (`mvn -DperformRelease=true clean install`)
3) download javadocs for `pojo-library` in `springboot-module` project
4) check the `application.yaml` file in `springboot-module` project