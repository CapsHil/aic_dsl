@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  com.zenika.aicdsl startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

@rem Add default JVM options here. You can also use JAVA_OPTS and COM_ZENIKA_AICDSL_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windowz variants

if not "%OS%" == "Windows_NT" goto win9xME_args
if "%@eval[2+2]" == "4" goto 4NT_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*
goto execute

:4NT_args
@rem Get arguments from the 4NT Shell from JP Software
set CMD_LINE_ARGS=%$

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\com.zenika.aicdsl-1.0.0-SNAPSHOT.jar;%APP_HOME%\lib\org.eclipse.xtext-2.10.0.jar;%APP_HOME%\lib\org.eclipse.xtext.xbase-2.10.0.jar;%APP_HOME%\lib\org.eclipse.xtext.util-2.10.0.jar;%APP_HOME%\lib\org.eclipse.xtend.lib-2.10.0.jar;%APP_HOME%\lib\guava-19.0-rc3.jar;%APP_HOME%\lib\guice-3.0.jar;%APP_HOME%\lib\org.eclipse.emf.ecore-2.11.1-v20150805-0538.jar;%APP_HOME%\lib\org.eclipse.emf.common-2.11.0-v20150805-0538.jar;%APP_HOME%\lib\org.eclipse.emf.ecore.xmi-2.11.1-v20150805-0538.jar;%APP_HOME%\lib\log4j-1.2.16.jar;%APP_HOME%\lib\antlr-runtime-3.2.jar;%APP_HOME%\lib\org.eclipse.equinox.common-3.6.0.jar;%APP_HOME%\lib\org.eclipse.xtext.xbase.lib-2.10.0.jar;%APP_HOME%\lib\org.eclipse.xtext.common.types-2.10.0.jar;%APP_HOME%\lib\org.eclipse.xtend.lib.macro-2.10.0.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\aopalliance-1.0.jar;%APP_HOME%\lib\cglib-2.2.1-v20090111.jar;%APP_HOME%\lib\asm-commons-5.0.1.jar;%APP_HOME%\lib\org.eclipse.emf.mwe2.lib-2.8.3.jar;%APP_HOME%\lib\org.eclipse.emf.codegen-2.11.0-v20150806-0404.jar;%APP_HOME%\lib\asm-tree-5.0.1.jar;%APP_HOME%\lib\org.eclipse.emf.mwe2.runtime-2.8.3.jar;%APP_HOME%\lib\asm-5.0.1.jar

@rem Execute com.zenika.aicdsl
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %COM_ZENIKA_AICDSL_OPTS%  -classpath "%CLASSPATH%" com.zenika.generator.AicdslGenerator.doGenerate %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable COM_ZENIKA_AICDSL_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%COM_ZENIKA_AICDSL_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
