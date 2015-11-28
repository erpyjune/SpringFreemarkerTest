<html xmlns="http://www.w3.org/1999/html">
<head>
    <title> Freemarker Test !! </title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" type="text/css" href="http://k1.imperavi.com/css/kube.css">
</head>
<body>

<h1>${message}</h1>
<#if productList??>
    <#list productList as product>
    <div class="units-row">
        <div class="unit-20" style="border-style: groove">
            <img src="${product.getThumbUrl()}" alt="${product.getProductName()}">
        </div>
        <div class="unit-80" style="border-style: groove">
        <a href="${product.getProductUrl()}" target="_blank">${product.getProductName()}</a><br>
        ${product.getProductUrl()}<br>
        ${product.getSpec1()}<br>
        </div>
    </div>

        <!-- print blog review -->
    <#list product.getBlogExtBodyList() as blogData>
    <div class="units-row">
        <div class="unit-20">
            blog
        </div>
        <div class="unit-20">
            <img src="${blogData.getPostImageUrl()}" alt="${product.getProductName()}">
        </div>
        <div class="unit-60">
            <a href="${blogData.getPostUrl()}" target="_blank">${blogData.getPostTitle()}</a><br>
        ${blogData.getPostDesc()}<br>
        ${blogData.getPostAuthor()}<br>
        </div>
    </div>
    </#list>

        <!-- print shopping mall reputation -->
    <#list product.getReputationDataList() as repuData>
    <div class="units-row">
        <div class="unit-20">reputation</div>
        <div class="unit-20"></div>
        <div class="unit-60">
        [${repuData.getMallName()}]<a href="${repuData.getRepuUrl()}" target="_blank">${repuData.getRepuData()}</a><br>
        </div>
    </div>
    </#list>
    </#list>
<#else>
<h3>Data is none!!</h3>
</#if>

<div class="units-row">
    <div class="30"></div>
    <div class="unit-40">
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=0&count=10">1</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=0&count=10">2</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=11&count=10">3</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=21&count=10">4</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=31&count=10">5</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=41&count=10">6</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=51&count=10">7</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=61&count=10">8</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=71&count=10">9</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=81&count=10">10</a>
        </span>
        <span class="label label-blue">
            <a href="http://localhost:8080/get_data?from=91&count=10">1</a>
        </span>
    </div>
    <div class="30"></div>
</div>

</body>
</html>