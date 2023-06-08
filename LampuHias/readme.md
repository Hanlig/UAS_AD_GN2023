# [BOBOT 30 – LAMPU HIAS JAVA IO] Pak Anton memiliki tiga lampu hias. Setiap lampu akan menyala setiap rentang waktu tertentu selama satu detik kemudian mati lagi. Lampu pertama menyala setiap rentang waktu P detik, lampu kedua menyala setiap rentang waktu Q detik, sedangkan lampu ketiga menyala setiap rentang waktu R detik. Di awal, ketiga lampu tersebut menyala secara bersamaan. Pak Anton bertanya-tanya, kapan lagi ketiga lampu tersebut akan menyala bersamaan? 

# Format Masukan:
	Baris pertama berisi sebuah tiga buah bilangan P, Q, R. Baris berikutnya berisi sebuah bilangan bulat positif N, menyatakan banyaknya pertanyaan Pak Dengklek. N buah baris berikutnya berisi masing-masing sebuah bilangan bulat positif T, menyatakan waktu dalam detik setelah ketiga lampu dinyalakan.
# Format Keluaran:
	N buah baris yang masing-masing berisi string berisi teks YA atau TIDAK (dalam huruf besar) yangvmenyatakan apakah pada waktu T tersebut, ketiga lampu menyala bersamaan atau tidak.

	Contoh:
	Input	Output
	4 6 9	TIDAK
	4		YA
	10		TIDAK
	36		TIDAK
	90
	100

# Penjelasan:
	Pada kasus ini, lampu pertama akan menyala setiap 4 detik, lampu kedua setiap 6 detik, dan lampu ketiga setiap 9 detik. Pada awalnya (T=0) semua lampu menyala bersamaan. Pada detik ke-36, ketiga lampu akan menyala lagi secara bersamaan. Namun pada detik ke-10, ke-90 dan ke-100, ketiga lampu tidak semuanya menyala secara bersamaan.
