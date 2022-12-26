<html>
    <head>
        <meta charset="UTF-8">
        <title>Leitura de arquivo texto</title>
    </head>
    <body>
        <?php
            $arq = file('C:\Users\mbacc\Documents\GitHub\Ciencia_da_Computacao\Periodo_1e2\LTP\Manipulacao_de_Arquivos_Txt\teste.txt');
            foreach($arq as $imprime){
                print_r($imprime);
            }
        ?>
    </body>
</html>