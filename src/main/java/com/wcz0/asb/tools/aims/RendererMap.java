package com.wcz0.asb.tools.aims;

import java.util.HashMap;
import java.util.Map;

public class RendererMap {
	public static Map<String, Class<?>> map = new HashMap<>();
		static {
				map.put("alert", Alert.class);
				map.put("anchor-nav", AnchorNav.class);
				map.put("app", Component.class);
				map.put("audio", Audio.class);
				map.put("avatar", Avatar.class);
				map.put("barcode", Barcode.class);
				map.put("bat-editor", EditorControl.class);
				map.put("breadcrumb", Breadcrumb.class);
				map.put("button", VanillaAction.class);
				map.put("button-group", ButtonGroup.class);
				map.put("button-group-select", ButtonGroupControl.class);
				map.put("button-toolbar", ButtonToolbar.class);
				map.put("c-editor", EditorControl.class);
				map.put("calendar", Calendar.class);
				map.put("card", Card.class);
				map.put("card2", Card2.class);
				map.put("cards", Cards.class);
				map.put("carousel", Carousel.class);
				map.put("chained-select", ChainedSelectControl.class);
				map.put("chart", Chart.class);
				map.put("chart-radios", ChartRadios.class);
				map.put("checkbox", CheckboxControl.class);
				map.put("checkboxes", CheckboxesControl.class);
				map.put("code", Code.class);
				map.put("coffeescript-editor", EditorControl.class);
				map.put("collapse", Collapse.class);
				map.put("collapse-group", CollapseGroup.class);
				map.put("color", Color.class);
				map.put("combo", ComboControl.class);
				map.put("condition-builder", ConditionBuilderControl.class);
				map.put("container", Container.class);
				map.put("control", FormControl.class);
				map.put("cpp-editor", EditorControl.class);
				map.put("crud", CRUDTable.class);
				map.put("crud2", CRUD2Table.class);
				map.put("csharp-editor", EditorControl.class);
				map.put("css-editor", EditorControl.class);
				map.put("custom", Custom.class);
				map.put("date", Date.class);
				map.put("date-range", DateRange.class);
				map.put("datetime", Date.class);
				map.put("dialog", Dialog.class);
				map.put("diff-editor", DiffControl.class);
				map.put("divider", Divider.class);
				map.put("dockerfile-editor", EditorControl.class);
				map.put("drawer", Drawer.class);
				map.put("dropdown-button", DropdownButton.class);
				map.put("each", Each.class);
				map.put("editor", EditorControl.class);
				map.put("fieldSet", FieldSetControl.class);
				map.put("fieldset", FieldSetControl.class);
				map.put("flex", Flex.class);
				map.put("flex-item", Component.class);
				map.put("form", Form.class);
				map.put("formula", FormulaControl.class);
				map.put("fsharp-editor", EditorControl.class);
				map.put("go-editor", EditorControl.class);
				map.put("grid", Grid.class);
				map.put("grid-2d", Grid2D.class);
				map.put("grid-nav", GridNav.class);
				map.put("group", GroupControl.class);
				map.put("handlebars-editor", EditorControl.class);
				map.put("hbox", HBox.class);
				map.put("hidden", HiddenControl.class);
				map.put("html", Html.class);
				map.put("html-editor", EditorControl.class);
				map.put("icon", Icon.class);
				map.put("icon-picker", IconPickerControl.class);
				map.put("icon-select", Component.class);
				map.put("iframe", IFrame.class);
				map.put("image", Image.class);
				map.put("images", Images.class);
				map.put("ini-editor", EditorControl.class);
				map.put("input-array", ArrayControl.class);
				map.put("input-city", InputCityControl.class);
				map.put("input-color", InputColorControl.class);
				map.put("input-date", DateControl.class);
				map.put("input-date-range", DateRangeControl.class);
				map.put("input-datetime", DateTimeControl.class);
				map.put("input-datetime-range", DateRangeControl.class);
				map.put("input-email", TextControl.class);
				map.put("input-excel", InputExcel.class);
				map.put("input-file", FileControl.class);
				map.put("input-formula", Component.class);
				map.put("input-group", InputGroupControl.class);
				map.put("input-image", ImageControl.class);
				map.put("input-month", MonthControl.class);
				map.put("input-month-range", MonthRangeControl.class);
				map.put("input-number", NumberControl.class);
				map.put("input-password", TextControl.class);
				map.put("input-quarter", QuarterControl.class);
				map.put("input-quarter-range", QuarterRangeControl.class);
				map.put("input-range", RangeControl.class);
				map.put("input-rating", RatingControl.class);
				map.put("input-repeat", RepeatControl.class);
				map.put("input-rich-text", RichTextControl.class);
				map.put("input-sub-form", SubFormControl.class);
				map.put("input-table", TableControl.class);
				map.put("input-tag", TagControl.class);
				map.put("input-text", TextControl.class);
				map.put("input-time", TimeControl.class);
				map.put("input-time-range", DateRangeControl.class);
				map.put("input-tree", TreeControl.class);
				map.put("input-url", TextControl.class);
				map.put("input-year", YearControl.class);
				map.put("java-editor", EditorControl.class);
				map.put("javascript-editor", EditorControl.class);
				map.put("json", Json.class);
				map.put("json-editor", EditorControl.class);
				map.put("json-schema", Json.class);
				map.put("json-schema-editor", JSONSchemaEditorControl.class);
				map.put("less-editor", EditorControl.class);
				map.put("link", Link.class);
				map.put("list", ListRenderer.class);
				map.put("list-select", ListControl.class);
				map.put("location-picker", LocationControl.class);
				map.put("log", Log.class);
				map.put("lua-editor", EditorControl.class);
				map.put("map", Mapping.class);
				map.put("mapping", Mapping.class);
				map.put("markdown", Markdown.class);
				map.put("markdown-editor", EditorControl.class);
				map.put("matrix-checkboxes", MatrixControl.class);
				map.put("month", Date.class);
				map.put("msdax-editor", EditorControl.class);
				map.put("multi-select", SelectControl.class);
				map.put("multiline-text", MultilineText.class);
				map.put("native-date", TextControl.class);
				map.put("native-number", TextControl.class);
				map.put("native-time", TextControl.class);
				map.put("nav", Nav.class);
				map.put("nested-select", NestedSelectControl.class);
				map.put("number", Component.class);
				map.put("objective-c-editor", EditorControl.class);
				map.put("office-viewer", Component.class);
				map.put("operation", Operation.class);
				map.put("page", Page.class);
				map.put("pagination", Pagination.class);
				map.put("pagination-wrapper", PaginationWrapper.class);
				map.put("panel", Panel.class);
				map.put("password", Password.class);
				map.put("php-editor", EditorControl.class);
				map.put("picker", PickerControl.class);
				map.put("plain", Plain.class);
				map.put("plaintext-editor", EditorControl.class);
				map.put("portlet", Portlet.class);
				map.put("postiats-editor", EditorControl.class);
				map.put("powershell-editor", EditorControl.class);
				map.put("progress", Progress.class);
				map.put("property", Property.class);
				map.put("pug-editor", EditorControl.class);
				map.put("python-editor", EditorControl.class);
				map.put("qr-code", QRCode.class);
				map.put("qrcode", QRCode.class);
				map.put("r-editor", EditorControl.class);
				map.put("radios", RadiosControl.class);
				map.put("razor-editor", EditorControl.class);
				map.put("remark", Remark.class);
				map.put("reset", VanillaAction.class);
				map.put("ruby-editor", EditorControl.class);
				map.put("sb-editor", EditorControl.class);
				map.put("scss-editor", EditorControl.class);
				map.put("search-box", SearchBox.class);
				map.put("select", SelectControl.class);
				map.put("service", Service.class);
				map.put("sol-editor", EditorControl.class);
				map.put("sparkline", SparkLine.class);
				map.put("spinner", Spinner.class);
				map.put("sql-editor", EditorControl.class);
				map.put("static", StaticExactControl.class);
				map.put("static-date", StaticExactControl.class);
				map.put("static-datetime", StaticExactControl.class);
				map.put("static-image", StaticExactControl.class);
				map.put("static-images", Component.class);
				map.put("static-json", Component.class);
				map.put("static-list", Component.class);
				map.put("static-month", StaticExactControl.class);
				map.put("static-table", StaticExactControl.class);
				map.put("static-time", StaticExactControl.class);
				map.put("status", Status.class);
				map.put("steps", Steps.class);
				map.put("submit", VanillaAction.class);
				map.put("swift-editor", EditorControl.class);
				map.put("switch", SwitchControl.class);
				map.put("table", Table.class);
				map.put("table-view", TableView.class);
				map.put("table2", TableSchema2.class);
				map.put("tabs", Tabs.class);
				map.put("tabs-transfer", TabsTransferControl.class);
				map.put("tabs-transfer-picker", TabsTransferPickerControl.class);
				map.put("tag", Tag.class);
				map.put("tags", Component.class);
				map.put("tasks", Tasks.class);
				map.put("text", Component.class);
				map.put("textarea", TextareaControl.class);
				map.put("time", Date.class);
				map.put("timeline", Timeline.class);
				map.put("tooltip-wrapper", TooltipWrapper.class);
				map.put("tpl", Tpl.class);
				map.put("transfer", TransferControl.class);
				map.put("transfer-picker", TransferPickerControl.class);
				map.put("tree-select", TreeSelectControl.class);
				map.put("typescript-editor", EditorControl.class);
				map.put("users-select", UserSelectControl.class);
				map.put("uuid", UUIDControl.class);
				map.put("vb-editor", EditorControl.class);
				map.put("vbox", VBox.class);
				map.put("video", Video.class);
				map.put("web-component", WebComponent.class);
				map.put("wizard", Wizard.class);
				map.put("words", Words.class);
				map.put("wrapper", Wrapper.class);
				map.put("xml-editor", EditorControl.class);
				map.put("yaml-editor", EditorControl.class);
			}

			public RendererMap set(String key, Class<?> value) {
				map.put(key, value);
				return this;
			}
}
