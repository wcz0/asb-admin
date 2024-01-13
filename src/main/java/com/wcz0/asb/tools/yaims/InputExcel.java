package com.wcz0.asb.tools.yaims;



/**
 * InputExcel 解析 Excel
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class InputExcel extends BaseRenderer 
{
    public InputExcel()
    {
        set("type", "input-excel");

    }

    /**
     * 是否解析所有 sheet
     */
    public InputExcel allSheets(boolean value)
    {
        return set("allSheets", value);
    }

    /**
     * 数据录入配置，自动填充或者参照录入
     */
    public InputExcel autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 表单最外层类名
     */
    public InputExcel className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项描述
     */
    public InputExcel description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public InputExcel disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputExcel disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否解析所有 sheet
     */
    public InputExcel includeEmpty(boolean value)
    {
        return set("includeEmpty", value);
    }

    /**
     * 是否内联
     */
    public InputExcel inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 表单控制器类名
     */
    public InputExcel inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 表单项标签
     */
    public InputExcel label(Object value)
    {
        return set("label", value);
    }

    /**
     * 表单项标签对齐方式，默认右对齐，仅在 mode为horizontal 时生效
     */
    public InputExcel labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * label 的类名
     */
    public InputExcel labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 表单项标签描述
     */
    public InputExcel labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * 字段名，指定该表单项提交时的 key
     */
    public InputExcel name(Object value)
    {
        return set("name", value);
    }

    /**
     * 解析模式
     */
    public InputExcel parseMode(Object value)
    {
        return set("parseMode", value);
    }

    /**
     * 表单项描述
     */
    public InputExcel placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否解析为纯文本
     */
    public InputExcel plainText(boolean value)
    {
        return set("plainText", value);
    }

    /**
     * 是否必填
     */
    public InputExcel required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 通过表达式来配置当前表单项是否为必填。
     */
    public InputExcel requiredOn(Object value)
    {
        return set("requiredOn", value);
    }

    /**
     * 是否该表单项值发生变化时就提交当前表单。
     */
    public InputExcel submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为 input-excel 渲染器。
     */
    public InputExcel type(Object value)
    {
        return set("type", value);
    }

    /**
     * 表单校验接口
     */
    public InputExcel validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 表单项值格式验证，支持设置多个，多个规则用英文逗号隔开。
     */
    public InputExcel validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 表单默认值
     */
    public InputExcel value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否可见
     */
    public InputExcel visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputExcel visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public InputExcel set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
