/**
 * Created with IntelliJ IDEA.
 * User: xperad
 * Date: 西暦.13/05/11
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */
function MenuRedirect(depth1, depth2) {
    var url = '';
    var mustLogin = '';
    depth1 = String(depth1);
    depth2 = String(depth2);

    switch (depth1) {
        case "AA":
            switch (depth2) {
                case "001":
                    url = "/AA/001";
                    break;
            }
            break;

        case "AB":
            switch (depth2) {
                case "001":
                    url = "/AB/001";
                    break;
            }
            break;

        case "BA":
            switch (depth2) {
                case "001":
                    url = "/BA/001";
                    break;

                case "002":
                    url = "/BA/002";
                    break;

            }
            break;

        case "BBA":
            switch (depth2) {
                case "001":
                    url = "/BBA/001";
                    break;
            }
            break;

        case "BBB":
            switch (depth2) {
                case "001":
                    url = "/BBB/001";
                    break;

                case "002":
                    url = "/BBB/002";
                    break;
            }
            break;

        case "BC":
            switch (depth2) {
                case "001":
                    url = "/BC/001";
                    break;
            }
            break;

        case "CA":
            switch (depth2) {
                case "001":
                    url = "/CA/001";
                    break;
            }
            break;

        case "CB":
            switch (depth2) {
                case "001":
                    url = "/CB/001";
                    break;
            }
            break;

        case "CC":
            switch (depth2) {
                case "001":
                    url = "/CC/001";
                    break;
            }
            break;

        case "ZA":
            switch (depth2) {
                case "001":
                    url = "/ZA/001";
                    $('<li>List1</li>').appendTo('div#side > ul');
                    break;

                case "002":
                    url = "/ZA/002";
                    break;

                case "003":
                    url = "/ZA/003";
                    break;

                case "004":
                    url = "/ZA/004";
                    break;

                case "005":
                    url = "/ZA/005";
                    break;

                case "006":
                    url = "/ZA/006";
                    break;

                case "007":
                    url = "/ZA/007";
                    break;

                case "008":
                    url = "/ZA/008";
                    break;

                case "009":
                    url = "/ZA/009";
                    break;

                case "010":
                    url = "/ZA/010";
                    break;

                case "011":
                    url = "/ZA/011";
                    break;

                case "012":
                    url = "/ZA/012";
                    break;

                case "013":
                    url = "/ZA/013";
                    break;

                case "014":
                    url = "/ZA/014";
                    break;

                case "015":
                    url = "/ZA/015";
                    break;
            }
            break;

    }

    if (url != null) {
        window.location.href = url;
    }
}