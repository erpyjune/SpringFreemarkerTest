<html>
<head>
    <title> Freemarker Test !! </title>
</head>
<body>
<h1>${message}</h1>
<#list productList as product>
    <a href="${product.getProductUrl()}" target="_blank">${product.getProductName()}</a><br>
    ${product.getProductUrl()}<br>
    <img src="${product.getThumbUrl()}" alt="${product.getProductName()}" width="76" height="76">
    ${product.getSpec1()}<br>

    <#list product.getBlogExtBodyList() as blogData>
    <img src="${blogData.getPostImageUrl()}" alt="${product.getProductName()}" width="76" height="76">
    [blog]<a href="${blogData.getPostUrl()}" target="_blank">${blogData.getPostTitle()}</a><br>
    ${blogData.getPostDesc()}<br>
    ${blogData.getPostAuthor()}<br>
    </#list>
================================================================================================<br>
</#list>
</body>
</html>