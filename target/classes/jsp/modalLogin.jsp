
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