<#ftl encoding='UTF-8'>
<html lang="en">
<head>
    <link href="/css/styles.css" rel="stylesheet">
    <title>Sign Up</title>
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Sign Up!
    </div>
    <form method="post" action="/signUp">
        <label for="login">Login
            <input class="input-field" type="text" id="login" name="login" maxlength="50">
        </label>
        <br>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password" maxlength="50">
        </label>
        <br>
        <label for="first-name">Name
            <input class="input-field"  id="first-name" name="firstName" maxlength="50">
        </label>
        <br>
        <label for="last-name">Surname
            <input class="input-field"  id="last-name" name="lastName" maxlength="50">
        </label>
        <input type="submit" value="SignUp">
    </form>
</div>
</body>
</html>
