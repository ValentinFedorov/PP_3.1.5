$(async function() {
    await getAllUsers()
})

async function getAllUsers () {
    const table = $("#allUsersTable").empty()
    fetch("/admin/api/admin", {
        headers: {
            'method' : 'GET',
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Referer': null
        }
    })
        .then((response) => response.json())
        .then((data) => {
            data.forEach(user => {
                let allUsersTable = `$(
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.name}</td>
                        <td>${user.surname}</td>
                        <td>${user.age}</td>
                        <td>${user.email}</td>
                        <td>${user.roles.map(role => " " + role.roleName.substring(5))}</td>
                        <td>
                             <button type="button" class="btn btn-success btn btn-info modal-open" id="editbutton"
                             onclick="editUser(${user.id})" data-toggle="modal" data-target="#modalEdit">
                             Edit
                             </button>
                        </td>     
                        <td>
                            <button type="button" class="btn btn-success btn btn-danger modal-open" id="deleteButton"
                             onclick="deleteUser(${user.id})" data-toggle="modal" data-target="#modalDelete">
                             Delete
                             </button>
                        </td>
                    </tr>
                )`
                table.append(allUsersTable)
            })
        })
}