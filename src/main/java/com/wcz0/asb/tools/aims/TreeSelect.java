package com.wcz0.asb.tools.aims;



/**
 * Tree 下拉选择框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/tree
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class TreeSelect extends BaseRenderer {

    public TreeSelect()
    {
        set("type", "tree-select");
    }

    /**
     * 添加时调用的接口
     */
    public TreeSelect addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public TreeSelect addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public TreeSelect addDialog(Object value)
    {
        return set("addDialog", value);
    }

    /**
     * 是否自动选中子节点
     */
    public TreeSelect autoCheckChildren(Object value)
    {
        return set("autoCheckChildren", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public TreeSelect autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 父子之间是否完全独立。
     */
    public TreeSelect cascade(boolean value)
    {
        return set("cascade", value);
    }

    /**
     * 容器 css 类名
     */
    public TreeSelect className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public TreeSelect clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public TreeSelect clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 是否可以新增
     */
    public TreeSelect creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public TreeSelect createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public TreeSelect deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public TreeSelect deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public TreeSelect deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public TreeSelect delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public TreeSelect desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public TreeSelect description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public TreeSelect descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public TreeSelect disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public TreeSelect disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public TreeSelect editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public TreeSelect editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public TreeSelect editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public TreeSelect editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 是否为选项添加默认的Icon，默认值为true
     */
    public TreeSelect enableDefaultIcon(boolean value)
    {
        return set("enableDefaultIcon", value);
    }

    /**
     * 是否开启节点路径模式
     */
    public TreeSelect enableNodePath(boolean value)
    {
        return set("enableNodePath", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public TreeSelect extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否隐藏
     */
    public TreeSelect hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public TreeSelect hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 是否隐藏选择框中已选中节点的祖先节点的文本信息
     */
    public TreeSelect hideNodePathLabel(boolean value)
    {
        return set("hideNodePathLabel", value);
    }

    /**
     * 是否隐藏顶级
     */
    public TreeSelect hideRoot(boolean value)
    {
        return set("hideRoot", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public TreeSelect hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public TreeSelect horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public TreeSelect id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public TreeSelect initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public TreeSelect initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public TreeSelect inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public TreeSelect inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public TreeSelect joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public TreeSelect label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public TreeSelect labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public TreeSelect labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 设置label字段
     */
    public TreeSelect labelField(Object value)
    {
        return set("labelField", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public TreeSelect labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public TreeSelect labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 标签的最大展示数量，超出数量后以收纳浮层的方式展示，仅在多选模式开启后生效
     */
    public TreeSelect maxTagCount(Object value)
    {
        return set("maxTagCount", value);
    }

    /**
     * 自定义选项
     */
    public TreeSelect menuTpl(Object value)
    {
        return set("menuTpl", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public TreeSelect mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public TreeSelect multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public TreeSelect name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public TreeSelect onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 选父级的时候，是否只把子节点的值包含在内
     */
    public TreeSelect onlyChildren(boolean value)
    {
        return set("onlyChildren", value);
    }

    /**
     * 单选时，只运行选择叶子节点
     */
    public TreeSelect onlyLeaf(boolean value)
    {
        return set("onlyLeaf", value);
    }

    /**
     * 选项集合
     */
    public TreeSelect options(Object value)
    {
        return set("options", value);
    }

    /**
     * 收纳标签的Popover配置
     */
    public TreeSelect overflowTagPopover(Object value)
    {
        return set("overflowTagPopover", value);
    }

    /**
     * 开启节点路径模式后，节点路径的分隔符
     */
    public TreeSelect pathSeparator(Object value)
    {
        return set("pathSeparator", value);
    }

    /**
     * 占位符
     */
    public TreeSelect placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public TreeSelect readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public TreeSelect readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public TreeSelect remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public TreeSelect removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public TreeSelect required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public TreeSelect resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 顶级节点是否可以创建子节点
     */
    public TreeSelect rootCreatable(boolean value)
    {
        return set("rootCreatable", value);
    }

    /**
     * 顶级选项的名称
     */
    public TreeSelect rootLabel(Object value)
    {
        return set("rootLabel", value);
    }

    /**
     * 顶级选项的值
     */
    public TreeSelect rootValue(Object value)
    {
        return set("rootValue", value);
    }

    /**
     * 是否可搜索
     */
    public TreeSelect searchable(boolean value)
    {
        return set("searchable", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public TreeSelect selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 显示图标
     */
    public TreeSelect showIcon(boolean value)
    {
        return set("showIcon", value);
    }

    /**
     * 是否显示展开线
     */
    public TreeSelect showOutline(boolean value)
    {
        return set("showOutline", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public TreeSelect size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public TreeSelect source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public TreeSelect staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public TreeSelect staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public TreeSelect staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public TreeSelect staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public TreeSelect staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public TreeSelect staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public TreeSelect staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public TreeSelect style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public TreeSelect submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型
     */
    public TreeSelect type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public TreeSelect validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public TreeSelect validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public TreeSelect validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public TreeSelect validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public TreeSelect value(Object value)
    {
        return set("value", value);
    }

    /**
     * 设置value字段
     */
    public TreeSelect valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 是否显示
     */
    public TreeSelect visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public TreeSelect visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public TreeSelect width(Object value)
    {
        return set("width", value);
    }

    /**
     * 选父级的时候是否把子节点的值也包含在内。
     */
    public TreeSelect withChildren(boolean value)
    {
        return set("withChildren", value);
    }


    public TreeSelect set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
