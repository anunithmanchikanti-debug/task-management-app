function addTask(){

  let taskInput = document.getElementById("taskInput");

  let li = document.createElement("li");

  li.innerHTML = taskInput.value;

  let deleteBtn = document.createElement("button");

  deleteBtn.innerHTML = "Delete";

  deleteBtn.onclick = function(){
    li.remove();
  }

  li.appendChild(deleteBtn);

  document.getElementById("taskList").appendChild(li);

  taskInput.value = "";
}
