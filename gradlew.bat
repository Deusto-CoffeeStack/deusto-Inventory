@echo off
setlocal
set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%
set DEFAULT_JVM_OPTS=
set JAVA_EXE=java
"%JAVA_EXE%" -Dorg.gradle.appname=%APP_BASE_NAME% %DEFAULT_JVM_OPTS% -classpath "%APP_HOME%gradle\\wrapper\\gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain %*
endlocal
