const loginBtn = document.querySelector(".navbar_login");
const loginButton = document.querySelector("#login-button");
const content = document.querySelector(".login-frame");
const checkText = document.querySelector("#check-text");

const modal = document.createElement("div");
const messageBox = document.createElement("div");
const messageBtn = document.createElement("button");
const message = document.createElement("span");

const checkId = document.createElement("span");
const controllerValue = document.querySelector(".controller-value");
const controllerErrorMessage = document.querySelector(".controller-error-message");


function userIdRegistCheck(event){

     const id = $('#user-id').val();
     const password = $('#password').val();
     const param = {"userId":id, "password":password};
     console.log(param.userId);
     console.log(param.password);
     $.ajax({ //컨트롤러 통신
        url: 'memberLogin',
        type:'post',
        dataType:'json',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(param),
        success:function(data){
            if(data.check == 1){
             console.log(data);
             message.innerText = "로그인 되었습니다.";
             
             popUpMessage(data);


            }else{
                console.log(data);
                message.innerText = "아이디나 비밀번호가 틀립니다.";
                popUpMessage(data);
                event.preventDefault();
            }

        },
           error:function(){
                console.log("에러");
          }

     })



//    if(controllerValue.textContent == 'false'){
//
//
//
//        message.innerText = "아이디나 비밀번호가 틀렸습니다.";
//        popUpMessage();
//        return false;
////         controllerErrorMessage.id = "";
//
//
//    }else if(controllerValue.textContent == 'true'){
//
//        return true
//    }
}



function popUpMessage(data){

    console.log("모달");
	modal.className = "modal2";
	messageBox.id = "message-box";
	messageBtn.id = "popup-button";
	//messageBtn.setAttribute("value","확인");
	messageBtn.innerText = "확인";


	content.appendChild(modal);
	modal.appendChild(messageBox);
	messageBox.appendChild(message);
	messageBox.appendChild(messageBtn);

	messageBtn.addEventListener("click",()=> {

	    modal.remove();
	    
	    if(data.check == true){
	     location.href="/index/";
	    }

	});

}

loginButton.addEventListener("click",userIdRegistCheck);
//loginBtn.addEventListener("click",loginPage);