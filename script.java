// Fungsi untuk mengirim pesan otomatis ke WhatsApp
function kirimPesanWhatsApp() {
  // GANTI DENGAN NOMOR WHATSAPP ANDA (Contoh: 6281234567890. Tanpa tanda '+' atau spasi)
  const nomorWA = "6282176216602"; // Menggunakan nomor yang ada di bagian pemesanan
  // const nomorWA = "6281234567890"; // Nomor contoh lama

  // Pesan default yang akan terisi otomatis
  const pesanDefault =
    "Halo SIREGAR SERVICE, saya tertarik untuk memesan jasa perbaikan komputer. Mohon bantuan lebih lanjut.";

  // Membuat link WhatsApp dan membukanya
  const linkWA = `https://wa.me/${nomorWA}?text=${encodeURIComponent(
    pesanDefault
  )}`;
  window.open(linkWA, "_blank");
}

// Fungsi untuk meng-handle scroll navigasi
window.addEventListener("scroll", function () {
  const header = document.getElementById("main-header");
  if (window.scrollY > 50) {
    header.classList.add("shadow-lg");
  } else {
    header.classList.remove("shadow-lg");
  }
});