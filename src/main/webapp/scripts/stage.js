function atualizarInput() {
  // 1. Selecionar o elemento select
  const selectElement = document.getElementById('selectStageTeam');

  // 2. Obter o valor selecionado
  const valorSelecionado = selectElement.ariaRowIndex; // ou selectElement.options[selectElement.selectedIndex].value

  // 3. Selecionar o elemento input
  const inputElement = document.getElementById('inputTeamNumber');

  // 4. Atribuir o valor do select ao input
  inputElement.value = valorSelecionado;
}



document.querySelector('#selectStageTeam').addEventListener("change", function() {
  if (this.value == "1") {
    console.log('Yes selected');
  }else{
     console.log('No selected');
  }
  const inputTeamNumber = document.getElementById('inputTeamNumber');
  const inputTeamName = document.getElementById('inputTeamName');
  let index = this.selectedIndex;

  // 4. Atribuir o valor do select ao input
  inputTeamNumber.value = this.value;
  inputTeamName.value = this.options[index].text;
});

$(function(){

let first = document.getElementById("#1colocado");
first.style.background = "gold";

});

/*
const selectElem = document.getElementById("#selectStageTeam");
const pElem = document.getElementById("#inputTeamNumber");
alert(selectElem);
selectElem.addEventListener("change", () => {
	const index = selectElem.selectedIndex;
	pElem.textContent = 'selectedIndex: ${index}';
});*/