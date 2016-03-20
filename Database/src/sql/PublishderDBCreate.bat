:: Change to script directory 
cd /d %~dp0\Database\src\sql

:: Use the ij tool to run the script
java org.apache.derby.tools.ij PublisherDBCreate.sql

:: Keep the command prompt open until the user presses a key
pause