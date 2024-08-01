package com.bloomtech.welcomeletter.services;

import com.bloomtech.welcomeletter.fileIO.FileManager;
import com.bloomtech.welcomeletter.models.Employee;

import java.io.IOException;

public class FormLetterService {
    private static final FileManager fileManager = new FileManager();

    public void generateWelcomeLetter(Employee employee) throws IOException {
        //TODO: Get template text from resources
        String template = fileManager.getTextFromFile("LetterTemplate");

        //TODO: Replace []ed text with correct info
        String replaced1 = template.replace("[company name]", employee.getCompany().getCompanyname());
        String replaced2 = replaced1.replace("[fullname]",employee.getFirstname() +" "+ employee.getLastname());
        String replaced3 = replaced2.replace("[startdate]", employee.getStartdate().toString());
        String replaced4 = replaced3.replace("[startingsalary]", ""+employee.getSalary());
        String replaced = replaced4.replace("[company starttime]", employee.getCompany().getCompanyname());

        //TODO: Write finalized String to file
        fileManager.writeTextToFile("WelcomeTestEmployee",replaced);
    }
}
