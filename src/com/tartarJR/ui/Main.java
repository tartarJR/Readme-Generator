package com.tartarJR.ui;

import com.tartarJR.controller.ReadmeController;

public class Main {

    public static void main(String[] args) {
        String title = "Implementation";
        String[] columnNames = {"Problem", "Subdomain", "Solution"};

        ReadmeController.generateGithubReadMeFile(title, columnNames);
    }
}
