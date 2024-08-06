## What is spring-access-inspector-for-gradle ?

This tool creates a table report to verify access control on Spring Boot routes.
It uses the [`Preauthorize`, `Secured` or `RolesAllowed`](https://www.baeldung.com/spring-security-method-security) annotation from `spring-security-config`

It creates a table.html file with a list of your routes and their preauthorize.

![List of your routes with preauthorize annotation](preauthorize-table.png)

## How to use it

Clone the repository:
`git clone https://github.com/yphinera/spring-access-inspector-for-gradle.git`

Go inside the repo:
`cd spring-access-inspector-for-gradle`

Compile the code:

`gradle build`

Run the code and give it your pom build.gradle path:

`gradle run -Pargs="/the_path/where/poms/are"`