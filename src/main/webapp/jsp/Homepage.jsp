<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset='utf-8'>
  <meta http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>Page Title</title>
  <meta name='viewport' content='width=device-width, initial-scale=1'>
  <link rel='stylesheet' type='text/css' media='screen' href='/JWEB.P.A102/resources/Css/styles.css'>
  <link rel='stylesheet' type='text/css' media='screen' href='/JWEB.P.A102/resources/Css/text.css'>
  <link rel='stylesheet' type='text/css' media='screen' href='/JWEB.P.A102/resources/Css/nav.css'>
  <link rel='stylesheet' type='text/css' media='screen' href='/JWEB.P.A102/resources/Css/layout.css'>
  <!-- <link rel='stylesheet' type='text/css' media='screen' href='../Css/modal.css'> -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<body>
  <nav class="nav-bg navbar navbar-expand-sm navbar-dark ">
    <a class="navbar-brand col-1"></a>
    <a class="navbar-brand-custom " id="Homepage1" href="#">Polls</a>
    <div class="collapse navbar-collapse " id="collapsibleNavId">
      <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
        <li class="nav-item ">
          <a class="nav-link-custom " id="Homepage2" href="#">Vote</a>
        </li>
        <li class="nav-item">
          <a class="nav-link-custom" id="Createpage" href="#">Create</a>
        </li>
        <li class="nav-item ">
          <a class="nav-link-custom" id="Listpage" href="#">List</a>
        </li>
      </ul>
    </div>

    <a onclick="document.getElementById('id01').style.display='block'" id= "btn-loginsubmit" style="width:auto;" class="btn-login2"
    href="#">Login</a>


  </nav>

  <div id="id01" class="modal">

    <form class="modal-content animate" action="" method="post">

        <div class="containerModal">
            <div>
                <label for="uname"><b>Alias:</b></label>
                <input type="text" id="txt-input1" placeholder="Enter your alias" name="uname" required>
            </div>
            <div>
                <label for="psw"><b>Password:</b></label>
                <input type="password" id="txt-input2" placeholder="Enter your password" name="psw" required>
            </div>
            <label>
                <input type="checkbox" checked="checked" name="remember"> Remember me
            </label>
            <div class="row fix-modal">
                <button class="button " id="btn-signin" type="button">Sign in</button>
            </div>

        </div>

        <div class="containerModal" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('id01').style.display='none' "
                class="cancelbtn button2">Close</button>
        </div>
    </form>
</div>

  <form>
    <div class="text-hd">

      <h1 class="h1">Great poll</h1>
      <p>1. it is necessary with you?</p>
      <div>

      </div>
      <div class="form-check">
        <label class="form-check-label text-custom">
          <input type="radio" class="form-check-input " value="option1">Yes
        </label>
      </div>
      <div class="form-check">
        <label class="form-check-label">
          <input type="radio" class="form-check-input" value="option2">No
        </label>
      </div>

    </div>

    <div class="text-hd">
      <p>2. Often pass polls?</p>

      <div class="form-check">
        <label class="form-check-label text-custom">
          <input type="radio" class="form-check-input" value="option1">Once a month
        </label>
      </div>
      <div class="form-check">
        <label class="form-check-label">
          <input type="radio" class="form-check-input" value="option2">Once a week
        </label>
      </div>

    </div>
    <div class="text-hd">
      <p>3. How old are you?</p>

      <div class="form-check">
        <label class="form-check-label text-custom ">
          <input type="radio" class="form-check-input " value="option1" checked>18-20
        </label>
      </div>
      <div class="form-check">
        <label class="form-check-label">
          <input type="radio" class="form-check-input" value="option2">21-23
        </label>
      </div>

      <div>
        <input class="btn-check" type="button" value="Retain">
  </form>

  </div>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"
    integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
  <script src="/JWEB.P.A102/resources/Js/loadPage.js"></script>
  <script src="/JWEB.P.A102/resources/Js/validateLogin.js">
  </script>
</body>

</html>