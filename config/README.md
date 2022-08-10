# About these files

The files found in this config section are for making Claris/FileMaker behave differently that its default settings. The files are outlined below.

## FMDefaultFields.xml

Per this [Claris tech page](https://support.claris.com/s/article/Default-Fields?language=en_US) it's possible to modify the default fields added to any newly created table. **Note:** As of adding this information here, the tech article only references the older file name of **DefaultFields.xml** (versions < 19). The file was renamed at version 19 to **FMDefaultFields.xml** and uses the new format which matches the changes made when the new menu option of **Save a Copy as XML...** was added to the **Tools** menu.

The file should be located in this location (version 19+).

- Mac OS: /Users/Shared/FileMaker/Shared/FMDefaultFields.xml
- Windows: C:/ProgramData/FileMaker/Shared/FMDefaultFields.xml

**Developer notes:**

- The tag **#\_FMI_0** in `<TagList>#_FMI_0 </TagList>` (note the exta space, it's required) is a setting that means the field will NOT be added to the default layout created by Claris/FileMaker.

- With CP/FMP (Claris Pro/FileMaker Pro 19+) you can use the **Save a Copy as XML...** menu option under the **Tools** menu to access the XML of defined fields.

## ReleaseDebugOn.txt

This configuration file is used for debugging and testing purposes. It will collect a log of the calls made between a client and server. The file can be used on either the client or server or both. Various settings will only have effect on certain platforms (as indicated within the file). See the documentation within the file for more information.

**Developer notes:**

- The file must exist in a specific location and be named exactly as presented.
- Enable/disable the file by simply changing the extension between **.txt** and **.off** or simply appending/removing .off to the end of the file name (restart required).
- Performance WILL be impacted based on the extra collection of data.
- Mac OS users can use **Console app** and clear results while watching individual actions.
- The option [extraflags:no_portal_drs](https://support.claris.com/s/article/Related-data-is-missing-in-a-portal-when-accessing-a-custom-app-on-the-Windows-platform?language=en_US) deals with possible Windows portal rendering issues.
