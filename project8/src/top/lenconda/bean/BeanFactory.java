package top.lenconda.bean;

import top.lenconda.services.CategoryService;
import top.lenconda.services.UserService;

public class BeanFactory {
    public static UserService getUserService() {
        return new UserService();
    }

    public static CategoryService getCategoryService() {
        return new CategoryService();
    }
}
