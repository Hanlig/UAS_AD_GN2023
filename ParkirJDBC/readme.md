# [BOBOT 45 – PARKIR JDBC]
Buatlah sebuah aplikasi sederhana untuk menambah dan menampilkan data parkir motor di suatu gedung tertentu diasumsikan dalam satu hari yang sama.  Aplikasi tersebut menjalankan 3 method sekaligus yaitu:
1. Tambah Data
2. Tampilkan Data
3. Hitung Total Pendapatan

Pada bagian Tambah Data aplikasi akan meminta pengguna untuk memasukan <strong>n buah data</strong> parkir baru.  Tabel parkir harus menyimpan informasi: id_pakir (int), no_plat (string), lama_detik (integer), harga (integer).  Id_pakir menggunakan <strong>auto_increment</strong>, lama_detik dalam satuan detik, harga dihitung otomatis, per jam Rp. 2000, lebih dari 1 jam dibulatkan ke atas. Database dapat dibuat SQLite saja.  <strong>Saat menambah data otomatis juga mengisi kolom harga dengan dihitung berdasarkan lama_detik dan tarif per jamnya<strong>.  Untuk Id_parkir juga tidak perlu diinput karena sudah auto_increment.

Contoh input program:

    Masukan jumlah data yang akan diinput: 3
    No_plat: AB1234ZZ
    Lama_detik: 3600
    No_plat: AB1234XX
    Lama_detik: 3650
    No_plat: AB1234YY
    Lama_detik: 7210

Contoh output program:

    ID		NO PLAT		LAMA	HARGA
    ==============================================
    1		AB1234AA	3601	4000
    2		R6872ZH		3602	4000
    3		AB1729SN	7250	6000
    4		AB777YY		450     2000
    5		R1234TY		3601	4000
    
    Total pendapatan : 20000