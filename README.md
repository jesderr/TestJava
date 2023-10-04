# TestJava
____
ArrayList,LinkedList
____
 - git commit --amend --no-edit - добавляет новый !staged! файл
 - git commit --amend -m 'message' - добавляет новый комментарий к комиту 
____
 - git restore (на моем ноутбуке git reset HEAD) --staged 'nameFile.txt' - переводит из staged в untracked
 - git reset --hard 'commit hash' - возвращает состояние репозитория к более раннему (к commit hash), можно сделать через log --oneline
 - git restore 'file' (на моем ноутбуке git checkout -- 'file' ) - откатывает изменения в файле до версии, которая была сохранена через commit or add
 - git push --force - принудительная отправка изменений на удаленный репозиторий и замена текущего состояния удаленной ветки вашим локальным состоянием
 ____
 - git diff a18d46e 8b8670f or git diff(после изменения файла) [--staged(после add)] - показывает изменения файла
 - command 'echo' with '>>' write text in file || '>' reset file and writing info
