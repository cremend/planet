/**
 * Created with IntelliJ IDEA.
 * User: xperad
 * Date: 西暦.13/04/27
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */

var layout;
var state_layout;
var _closable = false;
var _resizable = true;
var _slidable = false;
var _spacing_open = 3;
var _spacing_closed = 0;
var _togglerLength_open = 0;
var _togglerLength_closed = 0;
var _resizerDblClickToggle = false;

// Flag State
// 0: finished animation
// 1: during animation
var flg = 0;

function bodyLayout(eastSize, eastInitClosed) {

//	$("body").attr("onSelectstart", "return false");

    if (eastSize == null) {
        eastSize = "40%";
    }
    if (eastInitClosed == null) {
        eastInitClosed = false;
    }

    layout = $("body").layout({
        closable: _closable,
        resizable: false,
        slidable: _slidable,
        spacing_open: 0,
        spacing_closed: _spacing_closed,
        togglerLength_open: _togglerLength_open,
        togglerLength_closed: _togglerLength_closed,
        resizerDblClickToggle: _resizerDblClickToggle,
        resizerTip: "",

        north__paneSelector: "div#north_area",
        north__size: 90,
        north__showOverflowOnHover: true,

        south__paneSelector: "div#south_area",
        south__size: 50,

        center__paneSelector: "div#center_area",

        east__paneSelector: "div#east_area",
        east__size: eastSize,
        east__closable: true,
        east__resizable: _resizable,
        east__spacing_open: _spacing_open,
        east__initClosed: eastInitClosed,

        onopen_start: function () {
            flg = 1;
        },
        onopen_end: function () {
            flg = 0;
        },
        onclose_start: function () {
            flg = 1;
        },
        onclose_end: function () {
            flg = 0;
        }
    });
    state_layout = layout.state;
}