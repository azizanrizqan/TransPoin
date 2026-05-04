import { useState } from "react";
import API from "../services/api";

function AddUser() {
  const [nama, setNama] = useState("");
  const [email, setEmail] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    await API.post("/users", {
      nama,
      email,
      totalPoin: 0
    });

    alert("User berhasil ditambahkan");
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Tambah User</h2>

      <input
        type="text"
        placeholder="Nama"
        value={nama}
        onChange={(e) => setNama(e.target.value)}
      />

      <input
        type="email"
        placeholder="Email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />

      <button type="submit">Tambah</button>
    </form>
  );
}

export default AddUser;