package com.wcz0.asb.tools.aims;

public class Create <T>{

    public static BaseRenderer createRenderer(Class<? extends BaseRenderer> rendererClass) {
        try {
            return rendererClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static Page Page() {
        return new Page();
    }


}
