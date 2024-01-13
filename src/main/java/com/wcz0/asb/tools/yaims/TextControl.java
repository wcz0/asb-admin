package com.wcz0.asb.tools.yaims;



/**
 * Text 文本输入框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/text
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TextControl extends BaseRenderer 
{
    public TextControl()
    {
        set("type", "input-text");

    }

    /**
     * 添加时调用的接口
     */
    public TextControl addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public TextControl addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public TextControl addDialog(Object value)
    {
        return set("addDialog", value);
    }

    public TextControl addOn(Object value)
    {
        return set("addOn", value);
    }

    /**
     * 自动完成 API，当输入部分文字的时候，会将这些文字通过 {term} 可以取到，发送给接口。 接口可以返回匹配到的选项，帮助用户输入。
     */
    public TextControl autoComplete(Object value)
    {
        return set("autoComplete", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public TextControl autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public TextControl borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public TextControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 在内容为空的时候清除值
     */
    public TextControl clearValueOnEmpty(boolean value)
    {
        return set("clearValueOnEmpty", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public TextControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public TextControl clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 是否可以新增
     */
    public TextControl creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public TextControl createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public TextControl deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public TextControl deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public TextControl deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public TextControl delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public TextControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public TextControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public TextControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public TextControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public TextControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public TextControl editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public TextControl editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public TextControl editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public TextControl editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public TextControl extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否隐藏
     */
    public TextControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public TextControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public TextControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public TextControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public TextControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public TextControl initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public TextControl initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public TextControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public TextControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * control节点的CSS类名
     */
    public TextControl inputControlClassName(Object value)
    {
        return set("inputControlClassName", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public TextControl joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public TextControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public TextControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public TextControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public TextControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public TextControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 限制文字最大输入个数
     */
    public TextControl maxLength(Object value)
    {
        return set("maxLength", value);
    }

    /**
     * 限制文字最小输入个数
     */
    public TextControl minLength(Object value)
    {
        return set("minLength", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public TextControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public TextControl multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public TextControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 原生input标签的CSS类名
     */
    public TextControl nativeInputClassName(Object value)
    {
        return set("nativeInputClassName", value);
    }

    /**
     * 事件动作配置
     */
    public TextControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 选项集合
     */
    public TextControl options(Object value)
    {
        return set("options", value);
    }

    /**
     * 占位符
     */
    public TextControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 前缀
     */
    public TextControl prefix(Object value)
    {
        return set("prefix", value);
    }

    /**
     * 是否只读
     */
    public TextControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public TextControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public TextControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public TextControl removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public TextControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public TextControl resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public TextControl selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 是否显示计数
     */
    public TextControl showCounter(boolean value)
    {
        return set("showCounter", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public TextControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public TextControl source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public TextControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public TextControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public TextControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public TextControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public TextControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public TextControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public TextControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public TextControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public TextControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 后缀
     */
    public TextControl suffix(Object value)
    {
        return set("suffix", value);
    }

    /**
     * 自动转换值
     */
    public TextControl transform(Object value)
    {
        return set("transform", value);
    }

    /**
     * 是否去除首尾空白文本。
     */
    public TextControl trimContents(boolean value)
    {
        return set("trimContents", value);
    }

    /**
     * 表单项类型 可选值: input-text | input-email | input-url | input-password | native-date | native-time | native-number
     */
    public TextControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public TextControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public TextControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public TextControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public TextControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public TextControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public TextControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public TextControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public TextControl width(Object value)
    {
        return set("width", value);
    }

    public TextControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
