package com.wcz0.asb.tools.yaims;



/**
 * Select 下拉选择框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/select
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class SelectControl extends BaseRenderer 
{
    public SelectControl()
    {
        set("type", "select");

    }

    /**
     * 添加时调用的接口
     */
    public SelectControl addApi(Object value)
    {
        return set("addApi", value);
    }

    /**
     * 新增时的表单项。
     */
    public SelectControl addControls(Object value)
    {
        return set("addControls", value);
    }

    /**
     * 控制新增弹框设置项
     */
    public SelectControl addDialog(Object value)
    {
        return set("addDialog", value);
    }

    /**
     * 是否自动选中子节点
     */
    public SelectControl autoCheckChildren(Object value)
    {
        return set("autoCheckChildren", value);
    }

    /**
     * 自动完成 API，当输入部分文字的时候，会将这些文字通过 {term} 可以取到，发送给接口。 接口可以返回匹配到的选项，帮助用户输入。
     */
    public SelectControl autoComplete(Object value)
    {
        return set("autoComplete", value);
    }

    /**
     * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
     */
    public SelectControl autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 边框模式，全边框，还是半边框，或者没边框。 可选值: full | half | none
     */
    public SelectControl borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 可多选条件下，是否可全选
     */
    public SelectControl checkAll(boolean value)
    {
        return set("checkAll", value);
    }

    /**
     * 可多选条件下，全选项文案，默认 ”全选“
     */
    public SelectControl checkAllLabel(Object value)
    {
        return set("checkAllLabel", value);
    }

    /**
     * 容器 css 类名
     */
    public SelectControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public SelectControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 是否可清除。
     */
    public SelectControl clearable(boolean value)
    {
        return set("clearable", value);
    }

    /**
     * 当 selectMode 为 table 时定义表格列信息。
     */
    public SelectControl columns(Object value)
    {
        return set("columns", value);
    }

    /**
     * 是否可以新增
     */
    public SelectControl creatable(boolean value)
    {
        return set("creatable", value);
    }

    /**
     * 新增文字
     */
    public SelectControl createBtnLabel(Object value)
    {
        return set("createBtnLabel", value);
    }

    /**
     * 可多选条件下，是否默认全选中所有值
     */
    public SelectControl defaultCheckAll(boolean value)
    {
        return set("defaultCheckAll", value);
    }

    /**
     * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
     */
    public SelectControl deferApi(Object value)
    {
        return set("deferApi", value);
    }

    /**
     * 选项删除 API
     */
    public SelectControl deleteApi(Object value)
    {
        return set("deleteApi", value);
    }

    /**
     * 选项删除提示文字。
     */
    public SelectControl deleteConfirmText(Object value)
    {
        return set("deleteConfirmText", value);
    }

    /**
     * 分割符
     */
    public SelectControl delimiter(Object value)
    {
        return set("delimiter", value);
    }

    public SelectControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public SelectControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public SelectControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public SelectControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public SelectControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 编辑时调用的 API
     */
    public SelectControl editApi(Object value)
    {
        return set("editApi", value);
    }

    /**
     * 选项修改的表单项
     */
    public SelectControl editControls(Object value)
    {
        return set("editControls", value);
    }

    /**
     * 控制编辑弹框设置项
     */
    public SelectControl editDialog(Object value)
    {
        return set("editDialog", value);
    }

    /**
     * 是否可以编辑
     */
    public SelectControl editable(boolean value)
    {
        return set("editable", value);
    }

    /**
     * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
     */
    public SelectControl extractValue(boolean value)
    {
        return set("extractValue", value);
    }

    /**
     * 是否隐藏
     */
    public SelectControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public SelectControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public SelectControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public SelectControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public SelectControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 配置 source 接口初始拉不拉取。
     */
    public SelectControl initFetch(boolean value)
    {
        return set("initFetch", value);
    }

    /**
     * 用表达式来配置 source 接口初始要不要拉取
     */
    public SelectControl initFetchOn(Object value)
    {
        return set("initFetchOn", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public SelectControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public SelectControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 单个选项的高度，主要用于虚拟渲染
     */
    public SelectControl itemHeight(Object value)
    {
        return set("itemHeight", value);
    }

    /**
     * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
     */
    public SelectControl joinValues(boolean value)
    {
        return set("joinValues", value);
    }

    /**
     * 描述标题
     */
    public SelectControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public SelectControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public SelectControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 设置label字段
     */
    public SelectControl labelField(Object value)
    {
        return set("labelField", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public SelectControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public SelectControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 当 selectMode 为 associated 时用来定义左侧的选择模式 可选值: tree | list
     */
    public SelectControl leftMode(Object value)
    {
        return set("leftMode", value);
    }

    /**
     * 当 selectMode 为 associated 时用来定义左侧的选项
     */
    public SelectControl leftOptions(Object value)
    {
        return set("leftOptions", value);
    }

    public SelectControl loadingConfig(Object value)
    {
        return set("loadingConfig", value);
    }

    /**
     * 标签的最大展示数量，超出数量后以收纳浮层的方式展示，仅在多选模式开启后生效
     */
    public SelectControl maxTagCount(Object value)
    {
        return set("maxTagCount", value);
    }

    /**
     * 可以自定义菜单展示。
     */
    public SelectControl menuTpl(Object value)
    {
        return set("menuTpl", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public SelectControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 是否为多选模式
     */
    public SelectControl multiple(boolean value)
    {
        return set("multiple", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public SelectControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public SelectControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 选项的自定义CSS类名
     */
    public SelectControl optionClassName(Object value)
    {
        return set("optionClassName", value);
    }

    /**
     * 选项集合
     */
    public SelectControl options(Object value)
    {
        return set("options", value);
    }

    /**
     * 收纳标签的Popover配置
     */
    public SelectControl overflowTagPopover(Object value)
    {
        return set("overflowTagPopover", value);
    }

    /**
     * 下拉框 Popover 设置
     */
    public SelectControl overlay(Object value)
    {
        return set("overlay", value);
    }

    /**
     * 占位符
     */
    public SelectControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public SelectControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public SelectControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public SelectControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否可删除
     */
    public SelectControl removable(boolean value)
    {
        return set("removable", value);
    }

    /**
     * 是否为必填
     */
    public SelectControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 点清除按钮时，将表单项设置成当前配置的值。
     */
    public SelectControl resetValue(Object value)
    {
        return set("resetValue", value);
    }

    /**
     * 当 selectMode 为 associated 时用来定义右侧的选择模式 可选值: table | list | tree | chained
     */
    public SelectControl rightMode(Object value)
    {
        return set("rightMode", value);
    }

    /**
     * 搜索 API
     */
    public SelectControl searchApi(Object value)
    {
        return set("searchApi", value);
    }

    /**
     * 当 searchResultMode 为 table 时定义表格列信息。
     */
    public SelectControl searchResultColumns(Object value)
    {
        return set("searchResultColumns", value);
    }

    /**
     * 搜索结果展示模式 可选值: table | list | tree | chained
     */
    public SelectControl searchResultMode(Object value)
    {
        return set("searchResultMode", value);
    }

    /**
     * 是否可搜索
     */
    public SelectControl searchable(boolean value)
    {
        return set("searchable", value);
    }

    /**
     * 默认选择选项第一个值。
     */
    public SelectControl selectFirst(boolean value)
    {
        return set("selectFirst", value);
    }

    /**
     * 勾选展示模式 可选值: table | group | tree | chained | associated
     */
    public SelectControl selectMode(Object value)
    {
        return set("selectMode", value);
    }

    /**
     * 当在value值未匹配到当前options中的选项时，是否value值对应文本飘红显示
     */
    public SelectControl showInvalidMatch(boolean value)
    {
        return set("showInvalidMatch", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public SelectControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 可用来通过 API 拉取 options。
     */
    public SelectControl source(Object value)
    {
        return set("source", value);
    }

    /**
     * 是否静态展示
     */
    public SelectControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public SelectControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public SelectControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public SelectControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public SelectControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public SelectControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public SelectControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public SelectControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public SelectControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 表单项类型 可选值: select | multi-select
     */
    public SelectControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public SelectControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public SelectControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public SelectControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public SelectControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public SelectControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 设置value字段
     */
    public SelectControl valueField(Object value)
    {
        return set("valueField", value);
    }

    /**
     * 在选项数量达到多少时开启虚拟渲染
     */
    public SelectControl virtualThreshold(Object value)
    {
        return set("virtualThreshold", value);
    }

    /**
     * 是否显示
     */
    public SelectControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public SelectControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public SelectControl width(Object value)
    {
        return set("width", value);
    }

    public SelectControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
