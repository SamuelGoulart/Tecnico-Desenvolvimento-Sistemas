<?php
$nome = "Fulano de tal";

$idade = 19;
$dataNascimento =  date("Y") - $idade ;

/* 
 *Exibir na página o nome do usuário
 *e o seu ano de nascimento
 *
 * Exemplo: olá, Fulano de tal, você nasceu em 1988
 */

 echo "Olá $nome, você nasceu em $dataNascimento. <br>";

 echo "Hoje é ".date("d/m/Y");