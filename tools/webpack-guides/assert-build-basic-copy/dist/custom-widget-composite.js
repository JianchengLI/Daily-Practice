/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, {
/******/ 				configurable: false,
/******/ 				enumerable: true,
/******/ 				get: getter
/******/ 			});
/******/ 		}
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = 0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ (function(module, exports) {

(function () {
    'use strict';

    const REMOTE_EVENT_CLICK_DLELTE_BUTTON = "clickDeleteButton";
    const REMOTE_METHOD_ENABLE_EDIT_MODE = "enableEditMode";
    const REMOTE_METHOD_DISABLE_EDIT_MODE = "disableEditMode";

    const REMOTE_EVENT_CLICK_SAVE_BUTTON = "clickSaveButton";
    const REMOTE_EVENT_CLICK_UNDO_BUTTON = "clickUndoButton";

    const MENU_INPUT_VALUE_CLASS_NAME = "ClientCustomWidgetMenuTextInputValue";

    const TILES_FRAME_SERIALIZE = "serialize";
    const TILES_FRAME_GRISTERED = "gristered";
    const TILES_SELECTED = "selected";

    class FusionChartsFactory {
        static createCharts(id, chart) {
            var fusioncharts = null;
            switch (chart.type) {
                case "DOUGHNUT2D":
                    fusioncharts = FusionChartsFactory.doughnut2d(id, chart);
                    break;
                case "CYLINDER":
                    fusioncharts = FusionChartsFactory.cylinder(id, chart);
                    break;
                case "ANGULAR_GAUGE":
                    fusioncharts = FusionChartsFactory.angulargauge(id, chart);
                    break;
                default:
            }
            return fusioncharts;
        }

        static doughnut2d(id, chart) {
            return new FusionCharts({
                type: 'doughnut2d',
                renderAt: id,
                width: chart.width,
                height: chart.height,
                dataFormat: 'json',
                dataSource: {
                    "chart": {
                        "caption": "",
                        "subCaption": "",
                        "startingAngle": "235",
                        "captionAlignment": "left",
                        "paletteColors": "#0c8d6f, #cecece, #94c800",
                        "showHoverEffect": "0",
                        "showHoverEffectStr": "Error",
                        "showTooltip": "1",
                        "showValues": "0",
                        "slicingDistance": "0",
                        "theme": "fint"
                    },
                    "data": chart.data
                }
            });
        }

        static angulargauge(id, chart) {
            return new FusionCharts({
                type: 'angulargauge',
                renderAt: id,
                width: chart.width,
                height: chart.height,
                dataFormat: 'json',
                dataSource: {
                    "chart": {
                        lowerLimit: '0',
                        upperLimit: chart.data[4].value,
                        numberSuffix: chart.indiceUnitName,
                        showValue: '0',
                        valueBelowPivot: '1',
                        valueFontSize: '10',
                        valueFontColor: '#4D4D4D',
                        valueFontBold: '1',
                        gaugeStartAngle: '240',
                        gaugeEndAngle: '-60',
                        bgColor: '#ffffff',
                        bgAlpha: '0',
                        showBorder: '0',
                        theme: 'fint',
                        gaugeFillRatio: '',
                        showGaugeBorder: '0',
                        gaugeOuterRadius: '100%',
                        gaugeInnerRadius: '70%',
                        baseFontColor: 'BBBBBB',
                        showTickMarks: '0',
                        showTickValues: '0',
                        tickValueStep: '2',
                        placeTicksInside: '0',
                        majorTMNumber: '9',
                        minorTMNumber: '0',
                        majorTMHeight: '5',
                        minorTMHeight: '2',
                        majorTMAlpha: '0',
                        minorTMColor: '#f8f8f8',
                        majorTMColor: '#dddddd'
                    },
                    "colorRange": {
                        "color": [{
                            "minValue": chart.data[1].value,
                            "maxValue": chart.data[2].value,
                            "code": "#71cf62"
                        }, {
                            "minValue": chart.data[2].value,
                            "maxValue": chart.data[3].value,
                            "code": "#f4b351"
                        }, {
                            "minValue": chart.data[3].value,
                            "maxValue": chart.data[4].value,
                            "code": "#e74c3c"
                        }]
                    },
                    "dials": {
                        "dial": [{
                            "value": chart.data[0].value
                        }]
                    }
                }
            });
        }

        static cylinder(id, chart) {
            return new FusionCharts({
                type: 'cylinder',
                renderAt: id,
                width: chart.width,
                height: chart.height,
                dataFormat: 'json',
                dataSource: {
                    "chart": {
                        "theme": "fint",
                        "caption": "",
                        "subcaption": "",
                        "lowerLimit": "0",
                        "upperLimit": "100",
                        "lowerLimitDisplay": "0",
                        "upperLimitDisplay": "100",
                        "numberSuffix": "",
                        "showValue": "0",
                        "chartBottomMargin": "0"
                    },
                    "value": chart.data[0].value
                }
            });
        }
    }

    class Composite {
        constructor(properties) {
            this.properties = properties;
            this.ready = false;
            this.id = properties.widgetId;
            this.className = properties.className;
            this.uiid = properties.uiid;
            this.parent = rap.getObject(this.id);

            this.element = this.parent.$el.get()[0];
            this.onRender();
        }

        onChange() {}
        onReady() {}
        onSend() {}
        destroy() {
            rap.off("send", this.onSend);
        }

        /**
         * Waiting the selector's element with callback
         */
        waitingDo(selector, callback) {
            var checkReady = setInterval(function () {
                if ($("#" + selector).length !== 0) {
                    if (typeof callback === "function") {
                        callback(selector);
                    }
                    clearInterval(checkReady);
                }
            }, 100);
        }

        /**
         * Waiting the selector's element with callback
         * And parser un reference of a object
         */
        waitingDoWithReference(selector, reference, callback) {
            var checkReady = setInterval(function () {
                if ($("#" + selector).length !== 0) {
                    if (typeof callback === "function") {
                        callback(selector, reference);
                    }
                    clearInterval(checkReady);
                }
            }, 100);
        }

        onRender() {
            var composite = this;
            composite.element.setAttribute('id', composite.id);
            composite.element.setAttribute('uiid', composite.uiid);
            composite.element.setAttribute('class', composite.className);
            composite.waitingDo(composite.id, function (selector) {
                composite.ready = true;
            });
        }

        /**
         * Called by Re-drawable composite redraw{ remoteObject.call(reRender) }
         */
        redraw() {}
    }

    class TilesFrame extends Composite {
        constructor(properties) {
            super(properties);
            this.widgetBaseDimensions = properties.widgetBaseDimensions;
            this.widgetMargin = properties.widgetMargin;
            this.resizable = properties.resizable;
            this.disable = properties.disable;
            this.minCols = properties.minCols;
            this.maxCols = properties.maxCols;
            this.rwid = properties.rwid;
            this.serialization = properties.frame.serialize;
        }

        redraw(json) {
            var frame = this;
            var gridster;
            this.element.className += " gridster";
            this.waitingDo(this.id, function () {
                frame.gridster = $(frame.element).gridster({
                    widget_base_dimensions: [frame.widgetBaseDimensions, frame.widgetBaseDimensions],
                    widget_margins: [frame.widgetMargin, frame.widgetMargin],
                    min_cols: frame.minCols,
                    max_cols: frame.maxCols,
                    resize: {
                        enabled: frame.resizable
                    },
                    draggable: {
                        start: function (e, ui, $widget) {
                            // Prevent click during drag events
                            ui.$player.find("a").attr("disabled", "disabled");
                        },
                        stop: function (e, ui, $widget) {
                            var ro = rap.getRemoteObject(frame);
                            // Prevent click during drag events
                            ui.$player.find("a").on("click", function (e) {
                                if ($(this).is("[disabled]")) {
                                    e.preventDefault();
                                    $(this).removeAttr("disabled");
                                }
                            });
                            ro.call(TILES_FRAME_SERIALIZE, { "serialize": frame.gridster.serialize() });
                            ro.call(TILES_FRAME_SERIALIZE, { "serialize": frame.gridster.serialize() });
                        }
                    }
                }).data('gridster');

                if (frame.disable) frame.gridster.disable();

                $.each(frame.serialization, function () {
                    var tile = this;
                    frame.waitingDo(tile.id, function () {
                        var element = frame.gridster.add_widget($("#" + tile.id), tile.size_x, tile.size_y, tile.col, tile.row).get()[0];
                        //console.log(tile);
                        element.style.cssText = ""; //clean inner css
                        element.style.backgroundColor = tile.bg_color;
                        element.style.color = tile.color;
                        element.style.width = "";
                        element.style.width = "";
                        element.style.height = "";
                        element.style.left = "";
                        element.style.top = "";
                    });
                });

                var ro = rap.getRemoteObject(frame);
                ro.call(TILES_FRAME_GRISTERED, {});
            });
        }
    }

    class Tile extends Composite {
        constructor(properties) {
            super(properties);
            this.name = properties.name;
            this.col = properties.col;
            this.row = properties.row;
            this.size_x = properties.size_x;
            this.size_y = properties.size_y;
            this.url = properties.url;
            this.color = properties.color;
            this.bg_color = properties.bg_color;
            this.bg_image_src = properties.bg_image_src;
            this.show_label = properties.show_label;

            var tile = this;
            this.element.addEventListener('click', function () {
                var ro = rap.getRemoteObject(tile);
                ro.call(TILES_SELECTED);
            });
        }

        redraw() {}
    }

    class TileFontIcon extends Tile {
        constructor(properties) {
            super(properties);
            this.icon = properties.icon;
            this.vertical = properties.vertical;
            this.icon_only = properties.icon_only;
        }

        redraw() {
            if (this.icon_only) {
                if (this.url == null) this.element.innerHTML = "<div><i class=\"fa " + this.icon + "\" aria-hidden=\"true\"></i></div>";else {
                    this.element.innerHTML = "<div><a href=\"" + this.url + "\" target=\"_blank\">" + "<i class=\"fa " + this.icon + "\" aria-hidden=\"true\"></i></a></div>";
                }
            } else {
                if (this.vertical) {
                    if (this.url == null) this.element.innerHTML = "<div><i class=\"fa " + this.icon + "\" aria-hidden=\"true\"></i><br />" + this.name + "</div>";else this.element.innerHTML = "<div><a href=\"" + this.url + "\" target=\"_blank\">" + "<i class=\"fa " + this.icon + "\" aria-hidden=\"true\"></i><br />" + this.name;+"</a></div>";
                }
            }
        }
    }

    class TileSimple extends Tile {
        redraw() {
            if (this.bg_image_src) {
                if (this.show_label) {
                    var text = document.createElement('div');
                    text.innerHTML = this.name;
                    this.element.append(text);
                }

                if (this.url) {
                    var tile = this;
                    this.waitingDo(tile.id, function () {
                        var link = document.createElement('a');
                        link.href = tile.url;
                        link.target = "_blank";

                        $("#" + tile.id + " > div").append(link);
                        $("#" + tile.id + " > div > a").append($("#" + tile.id + " > div > div"));
                    });
                }
            } else {
                this.element.innerHTML = this.url ? "<a href=\"" + this.url + "\" target=\"_blank\"><b>" + this.name + "</a></b>" : "<b>" + this.name + "</b>";
            }
        }
    }

    class TileCharts extends Tile {
        constructor(properties) {
            super(properties);
            this.description = properties.description;
            this.rwid = properties.rwid;
            this.charts = properties.charts;
        }

        templateChart() {
            var chart_container_id = this.id + "_chart_container";
            var chart_container_info_id = this.id + "_chart_container_info";

            var charthtml = "<div class=\"charts_title\">" + this.name + "</div><div class =\"charts_container\">";
            for (var i = 0; i < this.charts.length; i++) {
                charthtml += this.templateRowChart(chart_container_id, chart_container_info_id, this.charts[i], i);
            }
            charthtml += "</div><div class =\"charts_description\">" + this.description + "</div>";
            return charthtml;
        }

        templateRowChart(container_id, container_info_id, chart, index) {
            return "<div id=\"" + container_id + "_" + index + "\">" + "</div>" + "<div id=\"" + container_info_id + "_" + index + "\" class=\"chart_info\">" + "<div class=\"chart_info_title\">" + chart.indiceTitle + "</div>" + "<div class=\"chart_info_value\">" + chart.data[0].value + " " + chart.indiceUnitName + "</div>" + "</div>";
        }

        redraw() {
            this.element.innerHTML = this.templateChart();
            for (var i = 0; i < this.charts.length; i++) {
                var chart = this.charts[i];

                this.waitingDoWithReference(this.id + "_chart_container_" + i, chart, function (id, chart) {
                    //console.log(chart);
                    var fusioncharts = FusionChartsFactory.createCharts(id, chart);
                    if (fusioncharts !== undefined) fusioncharts.render();
                });
            }
        }
    }

    class Menu extends Composite {
        constructor(properties) {
            super(properties);
            this.label = properties.label;
        }

        redraw() {
            this.element.innerHTML = "<i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i>" + this.label;
        }
    }

    class FontIcon extends Composite {
        constructor(properties) {
            super(properties);
            this.label = properties.label;
        }

        redraw(jsonObject) {
            // Vertical Layout
            if (jsonObject.vertical) {
                this.element.innerHTML = "<i class=\"fa " + jsonObject.icon + "\" aria-hidden=\"true\"></i><br />" + this.label;
            }
        }
    };

    class MenuFontIcon extends Menu {
        redraw(jsonObject) {
            // Vertical Layout
            if (jsonObject.vertical) {
                this.element.innerHTML = "<i class=\"fa " + jsonObject.icon + "\" aria-hidden=\"true\"></i><br />" + this.label;
            }
        }
    };

    class MenuContainerTitle extends Composite {
        constructor(properties) {
            super(properties);
            this.label = properties.label;
        }

        redraw() {
            this.element.innerHTML = this.label;
        }
    };

    class MenuContainerDefault extends Composite {
        constructor(properties) {
            super(properties);
            this.label = properties.label;
        }
        redraw(jsonObject) {
            if (jsonObject.depth) {
                this.element.className += " menu-depth-" + jsonObject.depth;
            }
        }
    }

    // TODO: Delete, Same to MenuContainerTitle
    class MenuItem extends Composite {
        constructor(properties) {
            super(properties);
            this.label = properties.label;
        }

        redraw() {
            this.element.innerHTML = this.label;
        }
    }

    // TODO: Delete, Same to MenuContainerDefault
    class MenuContainer extends Composite {
        constructor(properties) {
            super(properties);
            this.label = properties.label;
        }
        redraw(jsonObject) {
            if (jsonObject.depth) {
                this.element.className += " menu-depth-" + jsonObject.depth;
            }
        }
    }

    class MenuItemDeletable extends Composite {
        constructor(properties) {
            super(properties);
            this.label = properties.label;
        }

        redraw(jsonObject) {
            this.element.innerHTML = "<i class=\"fa fa-trash\" aria-hidden=\"true\"></i>" + this.label;

            var name = this.label;
            var ro = rap.getRemoteObject(this);

            MenuItemDeletable.prototype.waitingDo(this.id, function (id) {
                $("#" + id).find(".fa-trash").click(function (e) {
                    var respones = confirm("Are you sure to delete : " + name + " ?");
                    if (respones) {
                        ro.call(REMOTE_EVENT_CLICK_DLELTE_BUTTON, this);
                    } else {
                        // TODO:
                    }
                });
            });
        }
    }

    // TODO: Delete, Same to MenuContainerDefault
    class MenuContainerForms extends Composite {
        constructor(properties) {
            super(properties);
            this.label = properties.label;
        }
        redraw(jsonObject) {
            if (jsonObject.depth) {
                this.element.className += " menu-depth-" + jsonObject.depth;
            }
        }
    }

    // TODO: Delete, Same to MenuContainerTitle
    class MenuContainerFooter extends Composite {
        constructor(properties) {
            super();
            this.label = properties.label;
        }

        redraw() {
            this.element.innerHTML = this.label;
        }
    }

    class MenuSelect extends Menu {
        constructor(properties) {
            super(properties);
            this.value = "";
        }

        redraw(jsonObject) {
            this.element.innerHTML = "<i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i><div class=\"ClientCustomWidgetMenuSelect\">" + this.label + "<br />" + "<div class=\"ClientCustomWidgetMenuSelectValue\">Empty ...</div></div>";
        }

        change_selected_value(jsonObject) {
            this.value = jsonObject.value;
            $("#" + this.id).find(".ClientCustomWidgetMenuSelectValue").first().text(this.value);
        }
    }

    // TODO: Delete, Same to MenuContainerTitle
    class MenuContainerHeader extends Composite {
        constructor(properties) {
            super();
            this.label = properties.label;
        }

        redraw() {
            this.element.innerHTML = this.label;
        }
    }

    class MenuFontIconSmall extends MenuFontIcon {}

    class Browser extends Composite {
        redraw(jsonObject) {
            this.element.innerHTML = '<iframe id="dashboard" marginwidth="0" marginheight="0" style="position: absolute; top: 0px; left: 0px;" src="' + jsonObject.url + '" scrolling="auto" frameborder="0" height="100%" width="100%"></iframe>';
            this.element.firstChild.focus();
        }

        flushing() {
            console.log("TODO: our disconnect here ...");
        }
    }

    class MenuTextInput extends MenuItem {
        constructor(properties, save_btn_name, undo_btn_name, input_value_class_name) {
            super(properties);
            this.label = properties.label;
            this.value = "";
            this.save_btn_name = save_btn_name;
            this.undo_btn_name = undo_btn_name;
            this.input_value_class_name = input_value_class_name;
        }

        redraw(jsonObject) {
            this.element.innerHTML = "<i class=\"fa fa-undo\" aria-hidden=\"true\"></i><i class=\"fa fa-floppy-o\" aria-hidden=\"true\"></i>" + this.label + "<br />" + "<div class=\"" + this.input_value_class_name + "\">Empty ...</div>";
        }

        enableEditMode(jsonObject) {

            var ro = rap.getRemoteObject(this);
            var menu_value_element = $("#" + this.id).find("." + this.input_value_class_name);

            $("#" + this.id).find(".fa").show();
            var save = $("#" + this.id).find(".fa-floppy-o");
            save.unbind("click");
            save.click(function (e) {
                this.value = menu_value_element.find(".form-control").val();
                ro.call(this.save_btn_name, this);
            });

            var undo = $("#" + this.id).find(".fa-undo");
            undo.unbind("click");
            undo.click(function () {
                ro.call(this.undo_btn_name, this);
            });

            this.value == "" ? menu_value_element.html("<input class=\"form-control\" placeholder=\"Virtual Machine Name\" type=\"text\">") : menu_value_element.html("<input class=\"form-control\" placeholder=\"Virtual Machine Name\" type=\"text\" value=" + this.value + ">");
        }

        disableEditMode(jsonObject) {
            this.value = jsonObject.value;

            $("#" + this.id).find(".fa").hide();
            var menu_value_element = $("#" + this.id).find("." + this.input_value_class_name);
            $("#" + this.id).find("." + this.input_value_class_name).html(this.value);
        }
    }

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.CustomWidgetComposite", {
        factory: function (properties) {
            return new Composite(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: ['serialize']
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.tiles.CustomWidgetTile", {
        factory: function (properties) {
            return new Tile(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.tiles.CustomWidgetTileSimple", {
        factory: function (properties) {
            return new TileSimple(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.tiles.CustomWidgetTileBrowser", {
        factory: function (properties) {
            return new Browser(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.tiles.CustomWidgetTilesFrame", {
        factory: function (properties) {
            return new TilesFrame(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.tiles.CustomWidgetTileCharts", {
        factory: function (properties) {
            return new TileCharts(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.tiles.CustomWidgetTileFontIcon", {
        factory: function (properties) {
            return new TileFontIcon(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.CustomWidgetButtonFontIcon", {
        factory: function (properties) {
            return new FontIcon(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.component.refactor.CustomWidgetMenuFontIcon", {
        factory: function (properties) {
            return new MenuFontIcon(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.component.refactor.CustomWidgetMenu", {
        factory: function (properties) {
            return new Menu(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw', "refresh"],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.component.refactor.CustomWidgetMenuContainerDefault", {
        factory: function (properties) {
            return new MenuContainerDefault(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.CustomWidgetBrowser", {
        factory: function (properties) {
            return new Browser(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw', 'flushing'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.CustomWidgetMenuContainerFooter", {
        factory: function (properties) {
            return new MenuContainerFooter(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.component.refactor.CustomWidgetMenuContainerForms", {
        factory: function (properties) {
            return new MenuContainerForms(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.component.refactor.CustomWidgetMenuContainer", {
        factory: function (properties) {
            return new MenuContainer(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.component.refactor.CustomWidgetMenuContainerHeader", {
        factory: function (properties) {
            return new MenuContainerHeader(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.component.refactor.CustomWidgetMenuContainerTitle", {
        factory: function (properties) {
            return new MenuContainerTitle(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.CustomWidgetMenuFontIconSmall", {
        factory: function (properties) {
            return new MenuFontIconSmall(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.component.refactor.CustomWidgetMenuItemDeletable", {
        factory: function (properties) {
            return new MenuItemDeletable(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.component.refactor.CustomWidgetMenuItem", {
        factory: function (properties) {
            return new MenuItem(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.CustomWidgetMenuSelect", {
        factory: function (properties) {
            return new MenuSelect(properties);
        },
        destructor: function (widget) {},
        methods: ['redraw', 'change_selected_value'],
        events: []
    });

    rap.registerTypeHandler("com.intrinsec.zeus.utils.ui.widgets.CustomWidgetMenuTextInput", {
        factory: function (properties) {
            return new MenuTextInput(properties, REMOTE_EVENT_CLICK_SAVE_BUTTON, REMOTE_EVENT_CLICK_UNDO_BUTTON, MENU_INPUT_VALUE_CLASS_NAME);
        },
        destructor: function (widget) {},
        methods: ['redraw', REMOTE_METHOD_ENABLE_EDIT_MODE, REMOTE_METHOD_DISABLE_EDIT_MODE],
        events: [REMOTE_EVENT_CLICK_SAVE_BUTTON, REMOTE_EVENT_CLICK_UNDO_BUTTON]
    });
})();

/***/ })
/******/ ]);