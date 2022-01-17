package ru.andersen.app.user_patterns.alexey.structural.facade.site;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.facade.site 
*/

import ru.andersen.app.user_patterns.alexey.structural.facade.site.model.SiteModel;

public class SiteConstructor {
    public void createSite(String password, String name, String title){
        SiteModel site = new SiteModel();

        site.setTitle(title);
        site.setAdminName(name);
        site.setAdminPass(password);
        site.setSiteId((int) Math.random());
        site.setAdminOs(System.getProperty("os.name"));
        site.setBackgroundImg("/src/img/cuteBackgroundImg.svg");
        site.setLogo("/src/img/cuteLogo.logo");
        site.setTag("someTags");

        System.out.println(site);
    }
}
