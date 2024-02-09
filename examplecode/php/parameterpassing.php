<?php

function callByRef(&$var) {
    $var = $var + 10;
}

function callByVal($var) {
    $var = $var + 10;
}

&a = 3;
echo "callByRef before: $a<br /n>";
callByRef($a);
echo "callByRef after: $a<br /n>";

echo "<br /n>";

&b = 3;
echo "callByVal before: $b<br /n>";
callByVal($b);
echo "callBVal after: $b<br /n>";