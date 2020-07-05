# Project1
Specification Document
The LockedMe.com has following capabilities. First the Code to display the welcome screen is shown then it displays the Application name and the developer details.
To make it user-friendly appropriate statements are used so that user understands what the application does. The details of the user interface such as options displaying the user interaction information is shown.

The first feature is to accept the user input to select one of the options listed. If the user doesn’t select from the options shown in the application the user is asked to enter a valid option. 
The first option returns the current file names in ascending order. For sorting the case-sensitivity issue is solved using CASE_INSENSITIVE_ORDER so that files with lowercase are not sorted after uppercase.
List is used as a data structure asList() method is used to return a fixed size list backed by the array. Then Collections.sort is used to sort the list which then helps in getting the sorted filenames.
The second option includes File Manipulation like Add, Delete, Search which is shown in the user interface. If user selects second option the user is again shown with a menu which is as follows:-
- Add a file of your choice 
- Delete a file of your choice
- Search a file of your choice
- Return to the main menu

The user then selects any of the above options, if the user selects an invalid option then the user is informed to enter valid option. 
The first option creates the file in the directory existing in the program. 
The user is prompted with a text saying the file is created in the respective directory. If the file with same name already exists then the file is not created again and user is informed that file already exists.

If the user selects the second option the desired file is Deleted from the existing directory list and to make sure that the exact file is deleted,
I have used .equals which compares to strings, the name of the file the user has entered and the file which already exists in that directory. 
In this way the case sensitivity issue is looked at and the exact file is deleted. If the user enters a file which is not there in the directory then the user is prompted with the message saying the file not found in that directory.  

If the user selects the third option then the user specified file is searched in the directory. 
To make sure that case sensitivity is considered so that exact file is searched I have used .equals function which compares the two strings the user entered file name and the file name retrieved by the file.getName through running a for loop in the directory to get the filenames. 
A user is prompted with Successful operation if the file is found and also the filename and directory is printed where the file is found. If the user specifies a file which does not exist then user is prompted with the message saying enter proper file name. 

If the user clicks the fourth option then the user is again able to see the previous menu options. The user can then close the application or continue using it.
Third option is to close the application. The application is closed.

Conclusion: The whole application is user friendly if the user enters anything which does not exist then the user is notified. The application flow is made in such a way that the user can easily navigate back to the main menu. 
The user is prompted with appropriate messages so that the user is not confused if something goes wrong. 
