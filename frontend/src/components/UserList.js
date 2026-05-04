import { useEffect, useState } from "react";
import API from "../services/api";

function UserList() {
  const [users, setUsers] = useState([]);

  const getUsers = async () => {
    try {
      const res = await API.get("/users");
      setUsers(res.data);
    } catch (err) {
      console.error(err);
    }
  };

  useEffect(() => {
    getUsers();
  }, []);

  return (
    <div>
      <h2>List Users</h2>
      {users.map((user) => (
        <div key={user.id}>
          <p>{user.nama} - {user.email}</p>
        </div>
      ))}
    </div>
  );
}

export default UserList;