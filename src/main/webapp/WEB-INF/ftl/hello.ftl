<html>
<head>
    <meta charset="UTF-8">
    <title> Freemarker Test !! </title>
</head>
<body>
<h1>${message}</h1>
<#if productList??>
    <#list productList as product>
        <a href="${product.getProductUrl()}" target="_blank">${product.getProductName()}</a><br>
        ${product.getProductUrl()}<br>
        <img src="${product.getThumbUrl()}" alt="${product.getProductName()}" width="76" height="76">
        ${product.getSpec1()}<br>

        <!-- print blog review -->
        <#list product.getBlogExtBodyList() as blogData>
        ############## blog review start ##############<br>
        <img src="${blogData.getPostImageUrl()}" alt="${product.getProductName()}" width="76" height="76">
        [blog]<a href="${blogData.getPostUrl()}" target="_blank">${blogData.getPostTitle()}</a><br>
        ${blogData.getPostDesc()}<br>
        ${blogData.getPostAuthor()}<br>
        ############## blog review end ##############<br>
        </#list>

        <!-- print shopping mall reputation -->
        <#list product.getReputationDataList() as repuData>
        ############## reputation start ##############<br>
        [repu:${repuData.getMallName()}]<a href="${repuData.getRepuUrl()}" target="_blank">${repuData.getRepuData()}</a><br>
        ############## reputation end ##############<br>
        </#list>
    ================================================================================================<br>
    </#list>
<#else>
<h3>Data is none!!</h3>
</#if>
</body>
</html>