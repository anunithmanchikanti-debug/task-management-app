function addTask(){

  let taskInput = document.getElementById("taskInput");

  let li = document.createElement("li");

  li.innerHTML = taskInput.value;

  document.getElementById("taskList").appendChild(li);

  taskInput.value = "";
}