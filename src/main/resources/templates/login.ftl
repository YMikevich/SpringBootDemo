<#ftl encoding='UTF-8'>
<html lang="en">
<head>
    <link href="/css/styles.css" rel="stylesheet">
    <title>Login</title>
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please Login!
    </div>
    <#if error??>
        <div class="form-style-2">
            Incorrect login or Password!
        </div>
    </#if>
    <form method="post" action="/login">
        <label for="login">Login
            <input class="input-field" type="text" id="login" name="login">
        </label>
        <br>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <br>
        <label for="remember-me">
            <input type="checkbox" id="remember-me" name="remember-me">Remember me</label>
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>
