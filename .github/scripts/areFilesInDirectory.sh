files=$(ls ./src/$1/resources)
found=false
for i in $files ; do
    echo $i
    found=true
    break
done
echo echo "::set-output name=bool::$found"