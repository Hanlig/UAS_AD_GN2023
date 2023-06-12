
# [SERIALISASI USER 35 POINT]

Buatlah program Java untuk men-serialisasi class User seperti yang sudah disediakan pada Github. Program yang harus dibuat adalah class Simpan dan class BacaLogin. Class Simpan menyimpan class User pada file serialisasi bernama user.db, setelah itu class BacaLogin akan membaca file serialisasi tersebut dan kemudian menggunakan user yang ada untuk mensimulasikan login dengan username dan password yang benar.

1. Class <strong>User</strong> memiliki 2 field yaitu username dan password (defaultnya 123456). Kemudian class User memiliki method ubahPassword dan method doLogin. User yang harus dibuat 2 buah, user1 memiliki username "user1" dan password "rahasia", sedangkan user2 memiliki username "user2" dan password "password".

2. Class <strong>Simpan</strong> hanya menggunakan 1 method main saja dimana class ini melakukan:
a. Membuat 2 user baru dengan username dan passwordnya seperti pada nomor 1.
b. User 1 login seharusnya berhasil karena passwordnya benar.
c. User 2 ubah password menjadi "passwordbaru"
d. User 2 login harusnya gagal
e. Simpan user1 dan user2 ke file serialisasi, ingat password tidak ikut disimpan

3. Class <strong>Baca</strong> hanya memiliki method main saja dengan urutan kegiatan:
a. Baca file serialiasi
b. Baca user1 dan user2 ke dalam object masing-masing.
c. User1 melakukan login, harusnya gagal karena passwordnya kosong (null)
d. User2 melakukan login, harusnya juga gagal karena passwordnya kosong (null).
e. User1 mengubah password jadi "rahasia", user2 mengubah password jadi "password"
f. User1 dan User2 login kembali dan harusnya berhasil
