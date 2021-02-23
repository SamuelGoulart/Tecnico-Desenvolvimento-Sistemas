<?php
 include("variaveis.php");
  //  como imprimirum vetor usa o var_dumo();
 echo($_GET["nome"]);
 echo($_GET["idade"]);

 $ano_nascimento = date("Y") - $idade;

 echo "<h1>Olá, $nome, você nasceu em $ano_nascimento</h1>";

 if($idade > 60){
     echo "<h2>Você é do grupo de risco! Cuidado! </h2>";
 }

