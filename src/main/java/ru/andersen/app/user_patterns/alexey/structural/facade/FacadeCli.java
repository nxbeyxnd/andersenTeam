package ru.andersen.app.user_patterns.alexey.structural.facade;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.facade 
*/

import ru.andersen.app.user_patterns.alexey.structural.facade.site.SiteConstructor;

public class FacadeCli {
    public static void main(String[] args) {
        SiteConstructor siteConstructor = new SiteConstructor();
        siteConstructor.createSite("123qwe", "Pavel Durov", "Vk");
    }
}
