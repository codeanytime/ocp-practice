package annotation;

public @interface OnWeb {
    int onlineTime() default 8;
    boolean isAdmin() default false;
}
