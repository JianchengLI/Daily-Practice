/**
 * 模板字符串
 */
// 传统的JavaScript语言，输出模板通常是这样写的
// $('#result').append(
//     'There are <b>' + basket.count + '</b> ' +
//     'items in your basket, ' +
//     '<em>' + basket.onSale +
//     '</em> are on sale!'
// );


//上面这种写法相当繁琐不方便，ES6引入了模板字符串解决这个问题
// $('#result').append(`
//   There are <b>${basket.count}</b> items
//    in your basket, <em>${basket.onSale}</em>
//   are on sale!
// `);
let user = {}
user.name = 'Snow';
let action = 'be the king';
console.log(`User ${user.name} is not authorized to do ${action}.`)

/**
 *JavaScript代码，使用<%= ... %>输出JavaScript表达式
 */
var template =`
<ul>
  <% for(var i=0; i < data.supplies.length; i++) { %>
    <li><%= data.supplies[i] %></li>
  <% } %>
</ul>
`;

/**
 * !!! “标签模板”的一个重要应用，就是过滤HTML字符串，防止用户输入恶意内容
 */
var message =
    SaferHTML`<p>${sender} has sent you a message.</p>`;

function SaferHTML(templateData) {
    var s = templateData[0];
    for (var i = 1; i < arguments.length; i++) {
        var arg = String(arguments[i]);

        // Escape special characters in the substitution.
        s += arg.replace(/&/g, "&amp;")
            .replace(/</g, "&lt;")
            .replace(/>/g, "&gt;");

        // Don't escape special characters in the template.
        s += templateData[i];
    }
    return s;
}
