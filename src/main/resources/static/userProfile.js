$(async function () {
    await userProfile()
})

async function userProfile() {
    fetch("/user/api/loggedUser", {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/javascript',
            'Referer': null
        }
    })
        .then((res) => res.json())
        .then(data => {
            $("#authUser").append(data.email)
            let roles = data.roles.map(roles => " " + roles.roleName.substring(5))
            $("#authUserRoles").append(roles)
            let user = `$(
                <tr> 
                    <td>${data.id}</td>
                    <td>${data.name}</td>
                    <td>${data.surname}</td>
                    <td>${data.age}</td>
                    <td>${data.email}</td>
                    <td>${roles}</td>
                </tr>    
                )`;
            $("#authUserProfile").append(user)
        })
}