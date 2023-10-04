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