package com.eltonkola.data

/**
 * Represents ADB key events that can be sent to an Android device.
 *
 * @property keyCode The integer value for the key event.
 * @property adbCommandValue The string representation of the keycode (e.g., "KEYCODE_A").
 * @property description A human-readable description of the key.
 * @property char The character this key primarily represents, if applicable.
 */
enum class AdbKeyEvent(
    val keyCode: Int,
    val adbCommandValue: String,
    val description: String,
    val char: Char? = null // For character keys
) {
    // --- Special / Unknown ---
    KEYCODE_UNKNOWN(0, "KEYCODE_UNKNOWN", "Unknown Key"),

    // --- Navigation & Basic Control ---
    KEYCODE_SOFT_LEFT(1, "KEYCODE_SOFT_LEFT", "Soft Left Key"), // Rarely used on TV
    KEYCODE_SOFT_RIGHT(2, "KEYCODE_SOFT_RIGHT", "Soft Right Key"), // Rarely used on TV
    KEYCODE_HOME(3, "KEYCODE_HOME", "Home"),
    KEYCODE_BACK(4, "KEYCODE_BACK", "Back"),
    KEYCODE_CALL(5, "KEYCODE_CALL", "Call Key"), // Phone specific
    KEYCODE_ENDCALL(6, "KEYCODE_ENDCALL", "End Call Key"), // Phone specific

    // --- Numbers 0-9 ---
    KEYCODE_0(7, "KEYCODE_0", "Number 0", '0'),
    KEYCODE_1(8, "KEYCODE_1", "Number 1", '1'),
    KEYCODE_2(9, "KEYCODE_2", "Number 2", '2'),
    KEYCODE_3(10, "KEYCODE_3", "Number 3", '3'),
    KEYCODE_4(11, "KEYCODE_4", "Number 4", '4'),
    KEYCODE_5(12, "KEYCODE_5", "Number 5", '5'),
    KEYCODE_6(13, "KEYCODE_6", "Number 6", '6'),
    KEYCODE_7(14, "KEYCODE_7", "Number 7", '7'),
    KEYCODE_8(15, "KEYCODE_8", "Number 8", '8'),
    KEYCODE_9(16, "KEYCODE_9", "Number 9", '9'),

    // --- Symbols & Special Characters (Common) ---
    KEYCODE_STAR(17, "KEYCODE_STAR", "Star (*)", '*'),
    KEYCODE_POUND(18, "KEYCODE_POUND", "Pound (#)", '#'),

    // --- D-Pad Navigation ---
    KEYCODE_DPAD_UP(19, "KEYCODE_DPAD_UP", "D-Pad Up"),
    KEYCODE_DPAD_DOWN(20, "KEYCODE_DPAD_DOWN", "D-Pad Down"),
    KEYCODE_DPAD_LEFT(21, "KEYCODE_DPAD_LEFT", "D-Pad Left"),
    KEYCODE_DPAD_RIGHT(22, "KEYCODE_DPAD_RIGHT", "D-Pad Right"),
    KEYCODE_DPAD_CENTER(23, "KEYCODE_DPAD_CENTER", "D-Pad Center / OK"),

    // --- Volume Control ---
    KEYCODE_VOLUME_UP(24, "KEYCODE_VOLUME_UP", "Volume Up"),
    KEYCODE_VOLUME_DOWN(25, "KEYCODE_VOLUME_DOWN", "Volume Down"),

    // --- Power ---
    KEYCODE_POWER(26, "KEYCODE_POWER", "Power"),

    // --- Camera (Less relevant for TV) ---
    KEYCODE_CAMERA(27, "KEYCODE_CAMERA", "Camera Key"),
    KEYCODE_CLEAR(28, "KEYCODE_CLEAR", "Clear Key"), // Can be used to clear text fields

    // --- Alphabetic Characters A-Z ---
    KEYCODE_A(29, "KEYCODE_A", "Letter A", 'A'),
    KEYCODE_B(30, "KEYCODE_B", "Letter B", 'B'),
    KEYCODE_C(31, "KEYCODE_C", "Letter C", 'C'),
    KEYCODE_D(32, "KEYCODE_D", "Letter D", 'D'),
    KEYCODE_E(33, "KEYCODE_E", "Letter E", 'E'),
    KEYCODE_F(34, "KEYCODE_F", "Letter F", 'F'),
    KEYCODE_G(35, "KEYCODE_G", "Letter G", 'G'),
    KEYCODE_H(36, "KEYCODE_H", "Letter H", 'H'),
    KEYCODE_I(37, "KEYCODE_I", "Letter I", 'I'),
    KEYCODE_J(38, "KEYCODE_J", "Letter J", 'J'),
    KEYCODE_K(39, "KEYCODE_K", "Letter K", 'K'),
    KEYCODE_L(40, "KEYCODE_L", "Letter L", 'L'),
    KEYCODE_M(41, "KEYCODE_M", "Letter M", 'M'),
    KEYCODE_N(42, "KEYCODE_N", "Letter N", 'N'),
    KEYCODE_O(43, "KEYCODE_O", "Letter O", 'O'),
    KEYCODE_P(44, "KEYCODE_P", "Letter P", 'P'),
    KEYCODE_Q(45, "KEYCODE_Q", "Letter Q", 'Q'),
    KEYCODE_R(46, "KEYCODE_R", "Letter R", 'R'),
    KEYCODE_S(47, "KEYCODE_S", "Letter S", 'S'),
    KEYCODE_T(48, "KEYCODE_T", "Letter T", 'T'),
    KEYCODE_U(49, "KEYCODE_U", "Letter U", 'U'),
    KEYCODE_V(50, "KEYCODE_V", "Letter V", 'V'),
    KEYCODE_W(51, "KEYCODE_W", "Letter W", 'W'),
    KEYCODE_X(52, "KEYCODE_X", "Letter X", 'X'),
    KEYCODE_Y(53, "KEYCODE_Y", "Letter Y", 'Y'),
    KEYCODE_Z(54, "KEYCODE_Z", "Letter Z", 'Z'),

    // --- Punctuation & Symbols ---
    KEYCODE_COMMA(55, "KEYCODE_COMMA", "Comma (,)", ','),
    KEYCODE_PERIOD(56, "KEYCODE_PERIOD", "Period (.)", '.'),
    KEYCODE_ALT_LEFT(57, "KEYCODE_ALT_LEFT", "Left Alt"),
    KEYCODE_ALT_RIGHT(58, "KEYCODE_ALT_RIGHT", "Right Alt"),
    KEYCODE_SHIFT_LEFT(59, "KEYCODE_SHIFT_LEFT", "Left Shift"),
    KEYCODE_SHIFT_RIGHT(60, "KEYCODE_SHIFT_RIGHT", "Right Shift"),
    KEYCODE_TAB(61, "KEYCODE_TAB", "Tab"),
    KEYCODE_SPACE(62, "KEYCODE_SPACE", "Space", ' '),
    KEYCODE_SYM(63, "KEYCODE_SYM", "Symbol Key"), // Access symbol layer on virtual kbd
    KEYCODE_EXPLORER(64, "KEYCODE_EXPLORER", "Web Browser Key"), // Phone specific
    KEYCODE_ENVELOPE(65, "KEYCODE_ENVELOPE", "Email Key"), // Phone specific
    KEYCODE_ENTER(66, "KEYCODE_ENTER", "Enter / OK"),
    KEYCODE_DEL(67, "KEYCODE_DEL", "Delete (Backspace)"), // Backspace
    KEYCODE_GRAVE(68, "KEYCODE_GRAVE", "Grave Accent (` `)", '`'),
    KEYCODE_MINUS(69, "KEYCODE_MINUS", "Minus (-)", '-'),
    KEYCODE_EQUALS(70, "KEYCODE_EQUALS", "Equals (=)", '='),
    KEYCODE_LEFT_BRACKET(71, "KEYCODE_LEFT_BRACKET", "Left Bracket ([)", '['),
    KEYCODE_RIGHT_BRACKET(72, "KEYCODE_RIGHT_BRACKET", "Right Bracket (])", ']'),
    KEYCODE_BACKSLASH(73, "KEYCODE_BACKSLASH", "Backslash (\\)", '\\'),
    KEYCODE_SEMICOLON(74, "KEYCODE_SEMICOLON", "Semicolon (;)", ';'),
    KEYCODE_APOSTROPHE(75, "KEYCODE_APOSTROPHE", "Apostrophe (')", '\''),
    KEYCODE_SLASH(76, "KEYCODE_SLASH", "Slash (/)", '/'),
    KEYCODE_AT(77, "KEYCODE_AT", "At Sign (@)", '@'),
    KEYCODE_NUM(78, "KEYCODE_NUM", "Number Key Lock"), // For shifting numpad behavior
    KEYCODE_HEADSETHOOK(79, "KEYCODE_HEADSETHOOK", "Headset Hook Key"),
    KEYCODE_FOCUS(80, "KEYCODE_FOCUS", "Camera Focus Key"), // Phone specific
    KEYCODE_PLUS(81, "KEYCODE_PLUS", "Plus (+)", '+'), // Usually requires shift
    KEYCODE_MENU(82, "KEYCODE_MENU", "Menu"),
    KEYCODE_NOTIFICATION(83, "KEYCODE_NOTIFICATION", "Notification Key"),
    KEYCODE_SEARCH(84, "KEYCODE_SEARCH", "Search Key"),

    // --- Media Control ---
    KEYCODE_MEDIA_PLAY_PAUSE(85, "KEYCODE_MEDIA_PLAY_PAUSE", "Play/Pause"),
    KEYCODE_MEDIA_STOP(86, "KEYCODE_MEDIA_STOP", "Stop"),
    KEYCODE_MEDIA_NEXT(87, "KEYCODE_MEDIA_NEXT", "Next Track"),
    KEYCODE_MEDIA_PREVIOUS(88, "KEYCODE_MEDIA_PREVIOUS", "Previous Track"),
    KEYCODE_MEDIA_REWIND(89, "KEYCODE_MEDIA_REWIND", "Rewind"),
    KEYCODE_MEDIA_FAST_FORWARD(90, "KEYCODE_MEDIA_FAST_FORWARD", "Fast Forward"),

    // --- More Navigation / Editing ---
    KEYCODE_MUTE(91, "KEYCODE_MUTE", "Mute (Older, use VOLUME_MUTE)"), // Deprecated in favor of VOLUME_MUTE
    KEYCODE_PAGE_UP(92, "KEYCODE_PAGE_UP", "Page Up"),
    KEYCODE_PAGE_DOWN(93, "KEYCODE_PAGE_DOWN", "Page Down"),
    KEYCODE_PICTSYMBOLS(94, "KEYCODE_PICTSYMBOLS", "Picture Symbols Key"), // Emoji etc.
    KEYCODE_SWITCH_CHARSET(95, "KEYCODE_SWITCH_CHARSET", "Switch Charset Key"),

    // --- Gamepad Buttons (Less common for standard TV remotes) ---
    KEYCODE_BUTTON_A(96, "KEYCODE_BUTTON_A", "Gamepad Button A"),
    KEYCODE_BUTTON_B(97, "KEYCODE_BUTTON_B", "Gamepad Button B"),
    KEYCODE_BUTTON_C(98, "KEYCODE_BUTTON_C", "Gamepad Button C"),
    KEYCODE_BUTTON_X(99, "KEYCODE_BUTTON_X", "Gamepad Button X"),
    KEYCODE_BUTTON_Y(100, "KEYCODE_BUTTON_Y", "Gamepad Button Y"),
    KEYCODE_BUTTON_Z(101, "KEYCODE_BUTTON_Z", "Gamepad Button Z"),
    KEYCODE_BUTTON_L1(102, "KEYCODE_BUTTON_L1", "Gamepad Button L1"),
    KEYCODE_BUTTON_R1(103, "KEYCODE_BUTTON_R1", "Gamepad Button R1"),
    KEYCODE_BUTTON_L2(104, "KEYCODE_BUTTON_L2", "Gamepad Button L2"),
    KEYCODE_BUTTON_R2(105, "KEYCODE_BUTTON_R2", "Gamepad Button R2"),
    KEYCODE_BUTTON_THUMBL(106, "KEYCODE_BUTTON_THUMBL", "Gamepad Left Thumbstick Button"),
    KEYCODE_BUTTON_THUMBR(107, "KEYCODE_BUTTON_THUMBR", "Gamepad Right Thumbstick Button"),
    KEYCODE_BUTTON_START(108, "KEYCODE_BUTTON_START", "Gamepad Start Button"),
    KEYCODE_BUTTON_SELECT(109, "KEYCODE_BUTTON_SELECT", "Gamepad Select Button"),
    KEYCODE_BUTTON_MODE(110, "KEYCODE_BUTTON_MODE", "Gamepad Mode Button"),

    // --- System & Other ---
    KEYCODE_ESCAPE(111, "KEYCODE_ESCAPE", "Escape"),
    KEYCODE_FORWARD_DEL(112, "KEYCODE_FORWARD_DEL", "Forward Delete"),
    KEYCODE_CTRL_LEFT(113, "KEYCODE_CTRL_LEFT", "Left Ctrl"),
    KEYCODE_CTRL_RIGHT(114, "KEYCODE_CTRL_RIGHT", "Right Ctrl"),
    KEYCODE_CAPS_LOCK(115, "KEYCODE_CAPS_LOCK", "Caps Lock"),
    KEYCODE_SCROLL_LOCK(116, "KEYCODE_SCROLL_LOCK", "Scroll Lock"),
    KEYCODE_META_LEFT(117, "KEYCODE_META_LEFT", "Left Meta (e.g., Windows/Command key)"),
    KEYCODE_META_RIGHT(118, "KEYCODE_META_RIGHT", "Right Meta"),
    KEYCODE_FUNCTION(119, "KEYCODE_FUNCTION", "Function (Fn) Key"),
    KEYCODE_SYSRQ(120, "KEYCODE_SYSRQ", "System Request / Print Screen"),
    KEYCODE_BREAK(121, "KEYCODE_BREAK", "Break / Pause Key"),
    KEYCODE_MOVE_HOME(122, "KEYCODE_MOVE_HOME", "Move to Start of Line/List"),
    KEYCODE_MOVE_END(123, "KEYCODE_MOVE_END", "Move to End of Line/List"),
    KEYCODE_INSERT(124, "KEYCODE_INSERT", "Insert Key"),
    KEYCODE_FORWARD(125, "KEYCODE_FORWARD", "Forward (Web browser)"),
    KEYCODE_MEDIA_PLAY(126, "KEYCODE_MEDIA_PLAY", "Play"),
    KEYCODE_MEDIA_PAUSE(127, "KEYCODE_MEDIA_PAUSE", "Pause"),
    KEYCODE_MEDIA_CLOSE(128, "KEYCODE_MEDIA_CLOSE", "Close Media Application"),
    KEYCODE_MEDIA_EJECT(129, "KEYCODE_MEDIA_EJECT", "Eject Media"),
    KEYCODE_MEDIA_RECORD(130, "KEYCODE_MEDIA_RECORD", "Record"),

    // --- Function Keys F1-F12 ---
    KEYCODE_F1(131, "KEYCODE_F1", "F1"),
    KEYCODE_F2(132, "KEYCODE_F2", "F2"),
    KEYCODE_F3(133, "KEYCODE_F3", "F3"),
    KEYCODE_F4(134, "KEYCODE_F4", "F4"),
    KEYCODE_F5(135, "KEYCODE_F5", "F5"),
    KEYCODE_F6(136, "KEYCODE_F6", "F6"),
    KEYCODE_F7(137, "KEYCODE_F7", "F7"),
    KEYCODE_F8(138, "KEYCODE_F8", "F8"),
    KEYCODE_F9(139, "KEYCODE_F9", "F9"),
    KEYCODE_F10(140, "KEYCODE_F10", "F10"),
    KEYCODE_F11(141, "KEYCODE_F11", "F11"),
    KEYCODE_F12(142, "KEYCODE_F12", "F12"),

    KEYCODE_NUM_LOCK(143, "KEYCODE_NUM_LOCK", "Num Lock"),

    // --- Numpad Keys ---
    KEYCODE_NUMPAD_0(144, "KEYCODE_NUMPAD_0", "Numpad 0", '0'),
    KEYCODE_NUMPAD_1(145, "KEYCODE_NUMPAD_1", "Numpad 1", '1'),
    KEYCODE_NUMPAD_2(146, "KEYCODE_NUMPAD_2", "Numpad 2", '2'),
    KEYCODE_NUMPAD_3(147, "KEYCODE_NUMPAD_3", "Numpad 3", '3'),
    KEYCODE_NUMPAD_4(148, "KEYCODE_NUMPAD_4", "Numpad 4", '4'),
    KEYCODE_NUMPAD_5(149, "KEYCODE_NUMPAD_5", "Numpad 5", '5'),
    KEYCODE_NUMPAD_6(150, "KEYCODE_NUMPAD_6", "Numpad 6", '6'),
    KEYCODE_NUMPAD_7(151, "KEYCODE_NUMPAD_7", "Numpad 7", '7'),
    KEYCODE_NUMPAD_8(152, "KEYCODE_NUMPAD_8", "Numpad 8", '8'),
    KEYCODE_NUMPAD_9(153, "KEYCODE_NUMPAD_9", "Numpad 9", '9'),
    KEYCODE_NUMPAD_DIVIDE(154, "KEYCODE_NUMPAD_DIVIDE", "Numpad Divide (/)", '/'),
    KEYCODE_NUMPAD_MULTIPLY(155, "KEYCODE_NUMPAD_MULTIPLY", "Numpad Multiply (*)", '*'),
    KEYCODE_NUMPAD_SUBTRACT(156, "KEYCODE_NUMPAD_SUBTRACT", "Numpad Subtract (-)", '-'),
    KEYCODE_NUMPAD_ADD(157, "KEYCODE_NUMPAD_ADD", "Numpad Add (+)", '+'),
    KEYCODE_NUMPAD_DOT(158, "KEYCODE_NUMPAD_DOT", "Numpad Dot (.)", '.'),
    KEYCODE_NUMPAD_COMMA(159, "KEYCODE_NUMPAD_COMMA", "Numpad Comma (,)", ','),
    KEYCODE_NUMPAD_ENTER(160, "KEYCODE_NUMPAD_ENTER", "Numpad Enter"),
    KEYCODE_NUMPAD_EQUALS(161, "KEYCODE_NUMPAD_EQUALS", "Numpad Equals (=)", '='),
    KEYCODE_NUMPAD_LEFT_PAREN(162, "KEYCODE_NUMPAD_LEFT_PAREN", "Numpad Left Parenthesis (", '('),
    KEYCODE_NUMPAD_RIGHT_PAREN(163, "KEYCODE_NUMPAD_RIGHT_PAREN", "Numpad Right Parenthesis )", ')'),

    KEYCODE_VOLUME_MUTE(164, "KEYCODE_VOLUME_MUTE", "Volume Mute (Modern)"),
    KEYCODE_INFO(165, "KEYCODE_INFO", "Info Key"),
    KEYCODE_CHANNEL_UP(166, "KEYCODE_CHANNEL_UP", "Channel Up"),
    KEYCODE_CHANNEL_DOWN(167, "KEYCODE_CHANNEL_DOWN", "Channel Down"),
    KEYCODE_ZOOM_IN(168, "KEYCODE_ZOOM_IN", "Zoom In"),
    KEYCODE_ZOOM_OUT(169, "KEYCODE_ZOOM_OUT", "Zoom Out"),
    KEYCODE_TV(170, "KEYCODE_TV", "TV Key"), // Generic TV button
    KEYCODE_WINDOW(171, "KEYCODE_WINDOW", "Window Key"), // Picture-in-Picture or similar
    KEYCODE_GUIDE(172, "KEYCODE_GUIDE", "Program Guide (EPG)"),
    KEYCODE_DVR(173, "KEYCODE_DVR", "DVR Key"),
    KEYCODE_BOOKMARK(174, "KEYCODE_BOOKMARK", "Bookmark Key"),
    KEYCODE_CAPTIONS(175, "KEYCODE_CAPTIONS", "Toggle Captions"),
    KEYCODE_SETTINGS(176, "KEYCODE_SETTINGS", "Settings"),
    KEYCODE_TV_POWER(177, "KEYCODE_TV_POWER", "TV Power (Specific)"),
    KEYCODE_TV_INPUT(178, "KEYCODE_TV_INPUT", "TV Input Source"),
    KEYCODE_STB_POWER(179, "KEYCODE_STB_POWER", "Set-Top Box Power"),
    KEYCODE_STB_INPUT(180, "KEYCODE_STB_INPUT", "Set-Top Box Input"),
    KEYCODE_AVR_POWER(181, "KEYCODE_AVR_POWER", "AV Receiver Power"),
    KEYCODE_AVR_INPUT(182, "KEYCODE_AVR_INPUT", "AV Receiver Input"),

    // --- Colored Buttons (TV) ---
    KEYCODE_PROG_RED(183, "KEYCODE_PROG_RED", "Red Button"),
    KEYCODE_PROG_GREEN(184, "KEYCODE_PROG_GREEN", "Green Button"),
    KEYCODE_PROG_YELLOW(185, "KEYCODE_PROG_YELLOW", "Yellow Button"),
    KEYCODE_PROG_BLUE(186, "KEYCODE_PROG_BLUE", "Blue Button"),

    KEYCODE_APP_SWITCH(187, "KEYCODE_APP_SWITCH", "Recent Apps / App Switch"),

    // ... Many more less common or device-specific keys exist up to ~KEYCODE_PROFILE_SWITCH (288) ...

    // --- More System / Control ---
    KEYCODE_LANGUAGE_SWITCH(204, "KEYCODE_LANGUAGE_SWITCH", "Switch Language"),
    KEYCODE_MANNER_MODE(205, "KEYCODE_MANNER_MODE", "Manner/Silent Mode"),
    KEYCODE_3D_MODE(206, "KEYCODE_3D_MODE", "Toggle 3D Mode"),
    KEYCODE_CONTACTS(207, "KEYCODE_CONTACTS", "Contacts Key"),
    KEYCODE_CALENDAR(208, "KEYCODE_CALENDAR", "Calendar Key"),
    KEYCODE_MUSIC(209, "KEYCODE_MUSIC", "Music Key"),
    KEYCODE_CALCULATOR(210, "KEYCODE_CALCULATOR", "Calculator Key"),

    KEYCODE_ASSIST(219, "KEYCODE_ASSIST", "Assist Key (Generic)"),
    KEYCODE_BRIGHTNESS_DOWN(220, "KEYCODE_BRIGHTNESS_DOWN", "Brightness Down"),
    KEYCODE_BRIGHTNESS_UP(221, "KEYCODE_BRIGHTNESS_UP", "Brightness Up"),
    KEYCODE_MEDIA_AUDIO_TRACK(222, "KEYCODE_MEDIA_AUDIO_TRACK", "Cycle Audio Track"),
    KEYCODE_SLEEP(223, "KEYCODE_SLEEP", "Sleep"),
    KEYCODE_WAKEUP(224, "KEYCODE_WAKEUP", "Wake Up"),

    KEYCODE_VOICE_ASSIST(231, "KEYCODE_VOICE_ASSIST", "Voice Assistant"),
    KEYCODE_SYSTEM_NAVIGATION_UP(280, "KEYCODE_SYSTEM_NAVIGATION_UP", "System Navigation Up"),
    KEYCODE_SYSTEM_NAVIGATION_DOWN(281, "KEYCODE_SYSTEM_NAVIGATION_DOWN", "System Navigation Down"),
    KEYCODE_SYSTEM_NAVIGATION_LEFT(282, "KEYCODE_SYSTEM_NAVIGATION_LEFT", "System Navigation Left"),
    KEYCODE_SYSTEM_NAVIGATION_RIGHT(283, "KEYCODE_SYSTEM_NAVIGATION_RIGHT", "System Navigation Right");


    /**
     * Generates the full ADB shell command string for this key event.
     */
    fun getAdbCommand(): String {
        return "input keyevent $adbCommandValue" // Or use keyCode if you prefer "input keyevent <number>"
        // return "input keyevent $keyCode" // Alternative if you want to send the number directly
    }

    companion object {
        /**
         * Finds an AdbKeyEvent by its integer key code.
         * @return The matching AdbKeyEvent or null if not found.
         */
        fun fromKeyCode(code: Int): AdbKeyEvent? {
            return entries.find { it.keyCode == code }
        }

        /**
         * Finds an AdbKeyEvent by its adbCommandValue (e.g., "KEYCODE_HOME").
         * @return The matching AdbKeyEvent or null if not found.
         */
        fun fromCommandValue(commandVal: String): AdbKeyEvent? {
            return entries.find { it.adbCommandValue.equals(commandVal, ignoreCase = true) }
        }

        /**
         * Finds an AdbKeyEvent by the character it represents (case-insensitive for letters).
         * Useful for mapping typed characters to key events for a virtual keyboard.
         * Note: This is a simple mapping and doesn't handle shifted characters (e.g., '!' vs '1').
         * @return The matching AdbKeyEvent or null if not found.
         */
        fun fromChar(char: Char): AdbKeyEvent? {
            return entries.find {
                it.char != null && it.char.equals(char, ignoreCase = char.isLetter())
            }
        }
    }
}
