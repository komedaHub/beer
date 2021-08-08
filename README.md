## アクセスURL(HTML) ※まだ動作していない。。。
http://localhost:8083/beerdatabase/sample
## アクセスURL（API）
http://localhost:8083/beerdatabase/rest

##Docker
### イメージ作成
docker build -t my_ap_server .

### 起動
docker run --name my_ap_server -p 8083:8083 -d my_ap_server
