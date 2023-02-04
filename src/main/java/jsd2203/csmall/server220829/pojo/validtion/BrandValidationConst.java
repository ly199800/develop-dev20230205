package jsd2203.csmall.server220829.pojo.validtion;
/**
 * 用于向redis缓存中存放的类
 * */
public class BrandValidationConst {

    public static final String REGEXP_PINYIN = "[a-zA-Z]{2,15}";
    public static final String MESSAGE_PINYIN = "品牌的拼音必须是2~15位长度的纯字母";

}
