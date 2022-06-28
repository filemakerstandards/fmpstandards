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
